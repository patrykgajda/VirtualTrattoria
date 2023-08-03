import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class VirtualTrattoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String clientPizzaChoice;
        String doYouAlterIngredients;
        String clientIngredientChoice;
        Ingredients[] availableIngredients = {Ingredients.TOMATOSAUCE, Ingredients.CHEESE, Ingredients.MOZARELLA,Ingredients.MUSHROOM, Ingredients.HAM, Ingredients.PROSCIUTTO};

// Adding client + presenting Menu
        System.out.println("Hi, what's your name?");
        Clients newClient = new Clients(scanner.nextLine());
        System.out.println("What pizza would you like to eat?");
        System.out.println("Those are available");
        System.out.println(PizzaType.MARGHERITA + " (Tomato sauce, Cheese)");
        System.out.println(PizzaType.CAPRICIOSA + " (Tomato sauce, Cheese, Ham, Mushrooms)");
        System.out.println(PizzaType.CALZONE + " (Tomato sauce, Mozarella, Prosciutto)");

// creating pizza object + adding basic ingredients for selected pizza
        Pizza pizza = new Pizza();

        clientPizzaChoice = scanner.nextLine().toLowerCase();

        if (clientPizzaChoice.equals(PizzaType.CAPRICIOSA.name)){
            pizza.addCapriciosaIngredients();
        } else if (clientPizzaChoice.equals(PizzaType.MARGHERITA.name)){
            pizza.addMargheritaIngredients();
        } else if (clientPizzaChoice.equals(PizzaType.CALZONE.name)) {
            pizza.addCalzoneIngredients();
        } else {
            System.out.println("We don't have such pizza");
            System.exit(0);
        }

// altering Ingredients
        System.out.println("Would you like to alter your ingredients");
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
                    // The java string valueOf() method converts different types of values into string.
                    if (valueOf(availableIngredient).toLowerCase().equals(clientIngredientChoice)) {
                        pizza.pizzaIngredients.add(availableIngredient);
                    }
                }
// removing Ingredients
            } else if (addOrRemoveIngredients.equals("remove")) {

                System.out.println("What should we remove?");
                clientIngredientChoice = scanner.nextLine().toLowerCase();

                for (Ingredients availableIngredient : pizza.pizzaIngredients) {
                    // The java string valueOf() method converts different types of values into string.
                    if (valueOf(availableIngredient).toLowerCase().equals(clientIngredientChoice)) {
                        pizza.pizzaIngredients.remove(availableIngredient);
                    }
                }
            }
            System.out.println("Do you want to change something else");
            doYouAlterIngredients = scanner.nextLine();
        }

        System.out.println("Your order: " + clientPizzaChoice + " it contains: " + pizza.pizzaIngredients);

    }
}
