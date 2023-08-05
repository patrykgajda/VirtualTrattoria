import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class VirtualTrattoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String clientPizzaChoice;
        String doYouAlterIngredients;
        String clientIngredientChoice;
        Ingredients[] availableIngredients = {Ingredients.TOMATOSAUCE, Ingredients.CHEESE, Ingredients.MOZZARELLA,Ingredients.MUSHROOM, Ingredients.HAM, Ingredients.PROSCIUTTO};
        HashMap<Pizza,Clients> userOrder = new HashMap<>();

// Adding client + presenting Menu
        System.out.println("Hi, what's your name?");
        Clients newClient = new Clients(scanner.nextLine());
        System.out.println("What pizza would you like to eat?");
        System.out.println("Those are available:");
        System.out.println(PizzaType.MARGHERITA + " (Tomato sauce, Cheese)");
        System.out.println(PizzaType.CAPRICIOSA + " (Tomato sauce, Cheese, Ham, Mushrooms)");
        System.out.println(PizzaType.CALZONE + " (Tomato sauce, Mozzarella, Prosciutto)");

        clientPizzaChoice = scanner.nextLine().toLowerCase();

        if (clientPizzaChoice.equals(PizzaType.CAPRICIOSA.name)){
            Pizza pizza = new Pizza(PizzaType.CAPRICIOSA);
            pizza.addCapriciosaIngredients();
            userOrder.put(pizza,newClient);
        } else if (clientPizzaChoice.equals(PizzaType.MARGHERITA.name)){
            Pizza pizza = new Pizza(PizzaType.MARGHERITA);
            pizza.addMargheritaIngredients();
            userOrder.put(pizza,newClient);
        } else if (clientPizzaChoice.equals(PizzaType.CALZONE.name)) {
            Pizza pizza = new Pizza(PizzaType.CALZONE);
            pizza.addCalzoneIngredients();
            userOrder.put(pizza,newClient);
        } else {
            System.out.println("We don't have such pizza");
            System.exit(0);
        }

// altering Ingredients
        System.out.println("Would you like to alter your ingredients? [yes]");
        doYouAlterIngredients = scanner.nextLine();

        while (doYouAlterIngredients.equals("yes")) {
            System.out.println("Do you want to add or remove ingredient?");
            String addOrRemoveIngredients = scanner.nextLine();
// adding Ingredients
            if (addOrRemoveIngredients.equals("add")) {
                System.out.println("Those are available to add: " + Arrays.toString(availableIngredients));
                System.out.println("What is your choice");
                clientIngredientChoice = scanner.nextLine().toLowerCase();

                for (Ingredients availableIngredient : availableIngredients) {
                    if (availableIngredient.name.toLowerCase().equals(clientIngredientChoice)) {
                        pizza.pizzaIngredients.add(availableIngredient);
                    }
                }
// removing Ingredients
            } else if (addOrRemoveIngredients.equals("remove")) {

                System.out.println("What should we remove?");
                clientIngredientChoice = scanner.nextLine().toLowerCase();

                for (Ingredients availableIngredient : pizza.pizzaIngredients) {
                    if (availableIngredient.name.toLowerCase().equals(clientIngredientChoice)) {
                        pizza.pizzaIngredients.remove(availableIngredient);
                    }
                }
            }
            System.out.println("Do you want to change something else");
            doYouAlterIngredients = scanner.nextLine();
        }
        System.out.println("Would you like to order another pizza");

        System.out.println("Your order is completed: " + userOrder + " it contains: " + pizza.pizzaIngredients);

    }
}
