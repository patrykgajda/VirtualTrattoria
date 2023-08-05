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
        HashMap<Clients,Pizza> userOrder = new HashMap<>();

// Adding client + presenting Menu
        System.out.println("Hi, what's your name?");
        Clients newClient = new Clients(scanner.nextLine());
        System.out.println("What pizza would you like to eat?");
        System.out.println("Those are available:");
        System.out.println(PizzaName.MARGHERITA + " (Tomato sauce, Cheese)");
        System.out.println(PizzaName.CAPRICIOSA + " (Tomato sauce, Cheese, Ham, Mushrooms)");
        System.out.println(PizzaName.CALZONE + " (Tomato sauce, Mozzarella, Prosciutto)");

        clientPizzaChoice = scanner.nextLine().toLowerCase();

        if (clientPizzaChoice.equals(PizzaName.CAPRICIOSA.name)){
            Pizza pizza = new Capriciosa(PizzaName.CAPRICIOSA);


            userOrder.put(newClient,pizza);

            doYouAlterPizzaIngredients(pizza);

            System.out.println("Your order is completed: " + userOrder + " it contains: " + Pizza.pizzaIngredients);
//        } else if (clientPizzaChoice.equals(PizzaType.MARGHERITA.name)){
//            Pizza pizza = new Pizza(PizzaType.MARGHERITA);
//            pizza.addMargheritaIngredients();
//            userOrder.put(pizza,newClient);
//            pizza.doYouAlterPizzaIngredients();
//        } else if (clientPizzaChoice.equals(PizzaType.CALZONE.name)) {
//            Pizza pizza = new Pizza(PizzaType.CALZONE);
//            pizza.addCalzoneIngredients();
//            userOrder.put(pizza,newClient);
//            pizza.doYouAlterPizzaIngredients();
        } else {
            System.out.println("We don't have such pizza");
            System.exit(0);
        }

        System.out.println("Would you like to order another pizza");

        System.out.println("Your order is completed: " + newClient.name + " it contains: " + Pizza.pizzaIngredients);

    }
    public static void doYouAlterPizzaIngredients(Pizza pizza) {
        Scanner scanner = new Scanner(System.in);
        String doYouAlterIngredients;
        String clientIngredientChoice;
        System.out.println("Would you like to alter your ingredients? [yes]");
        doYouAlterIngredients = scanner.nextLine();

        while (doYouAlterIngredients.equals("yes")) {
            System.out.println("Do you want to add or remove ingredient?");
            String addOrRemoveIngredients = scanner.nextLine();
// adding Ingredients
            if (addOrRemoveIngredients.equals("add")) {
                System.out.println("Those are available to add: " + Arrays.toString(Pizza.availableIngredients));
                System.out.println("What is your choice");
                clientIngredientChoice = scanner.nextLine().toLowerCase();

                for (Ingredients availableIngredient : Pizza.availableIngredients) {
                    if (availableIngredient.name.toLowerCase().equals(clientIngredientChoice)) {
                        Pizza.pizzaIngredients.add(availableIngredient);
                    }
                }
// removing Ingredients
            } else if (addOrRemoveIngredients.equals("remove")) {

                System.out.println("What should we remove?");
                clientIngredientChoice = scanner.nextLine().toLowerCase();

                for (Ingredients availableIngredient : Pizza.pizzaIngredients) {
                    if (availableIngredient.name.toLowerCase().equals(clientIngredientChoice)) {
                        Pizza.pizzaIngredients.remove(availableIngredient);
                    }
                }
            }
            System.out.println("Do you want to change something else");
            doYouAlterIngredients = scanner.nextLine();
        }
    }
}
