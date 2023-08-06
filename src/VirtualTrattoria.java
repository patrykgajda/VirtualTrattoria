import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class VirtualTrattoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


// Adding client + presenting Menu
        System.out.println("Hi, what's your name?");
        Clients newClient = new Clients(scanner.nextLine());
        System.out.println("Here is our menu:");
        System.out.println(PizzaName.MARGHERITA + " (Tomato sauce, Cheese)");
        System.out.println(PizzaName.CAPRICIOSA + " (Tomato sauce, Cheese, Ham, Mushrooms)");
        System.out.println(PizzaName.CALZONE + " (Tomato sauce, Mozzarella, Prosciutto)");

        ArrayList<Pizza> orderedPizzaByClient = new ArrayList<>();

        whatPizzaWouldYouLikeToEat(orderedPizzaByClient);

        System.out.println("Client " + newClient.name + " ordered:");
        for (Pizza orderedPizza : orderedPizzaByClient) {
            System.out.println(orderedPizza.pizzaName + " " + orderedPizza.pizzaIngredients);
        }

    }
    public static void whatPizzaWouldYouLikeToEat(ArrayList<Pizza> pizzaList) {
        System.out.println("What pizza would you like to eat?");
        String clientPizzaChoice;
        Scanner scanner = new Scanner(System.in);
        clientPizzaChoice = scanner.nextLine().toLowerCase();

//        if (clientPizzaChoice.equals(PizzaName.CAPRICIOSA.name) || clientPizzaChoice.equals(PizzaName.CALZONE.name) || clientPizzaChoice.equals(PizzaName.MARGHERITA.name)) {
//
//            Pizza pizza = new Pizza());
//        }

        if (clientPizzaChoice.equals(PizzaName.CAPRICIOSA.name)){
            Pizza pizza = new Pizza(PizzaName.CAPRICIOSA);
            pizza.addCapriciosaIngredients();
            System.out.println("ur pizza has " + pizza.pizzaIngredients);
            doYouAlterPizzaIngredients(pizza);
            pizzaList.add(pizza);

        } else if (clientPizzaChoice.equals(PizzaName.MARGHERITA.name)){
            Pizza pizza = new Pizza(PizzaName.MARGHERITA);
            pizza.addMargheritaIngredients();
            System.out.println("ur pizza has " + pizza.pizzaIngredients);
            doYouAlterPizzaIngredients(pizza);
            pizzaList.add(pizza);

        } else if (clientPizzaChoice.equals(PizzaName.CALZONE.name)) {
            Pizza pizza = new Pizza(PizzaName.CALZONE);
            pizza.addCalzoneIngredients();
            System.out.println("ur pizza has " + pizza.pizzaIngredients);
            doYouAlterPizzaIngredients(pizza);
            pizzaList.add(pizza);

        } else {
            System.out.println("We don't have such pizza");
        }

        System.out.println("Is that all? [yes]");
        String isThatAll = scanner.nextLine();
        if (isThatAll.equals("yes")) {
            System.out.println("Your order is completed ");
        } else {
            whatPizzaWouldYouLikeToEat(pizzaList);
        }
    }
    public static void doYouAlterPizzaIngredients(Pizza pizza) {
        Scanner scanner = new Scanner(System.in);
        String doYouAlterIngredients;
        String clientIngredientChoice;
        System.out.println("Would you like to alter your ingredients? [yes]");
        doYouAlterIngredients = scanner.nextLine();

        while (doYouAlterIngredients.equals("yes")) {
            System.out.println("Do you want to add or remove ingredient? [add/remove]");
            String addOrRemoveIngredients = scanner.nextLine();
// adding Ingredients
            if (addOrRemoveIngredients.equals("add")) {
                System.out.println("Those are available to add: " + Arrays.toString(pizza.availableIngredients));
                System.out.println("What is your choice");
                clientIngredientChoice = scanner.nextLine().toLowerCase();

                for (Ingredients availableIngredient : pizza.availableIngredients) {
                    if (availableIngredient.name.equals(clientIngredientChoice)) {
                        pizza.pizzaIngredients.add(availableIngredient);
                    }
                }
// removing Ingredients
            } else if (addOrRemoveIngredients.equals("remove")) {

                System.out.println("What should we remove?");
                clientIngredientChoice = scanner.nextLine().toLowerCase();
                Ingredients ingredientToBeRemoved = null;
                for (Ingredients availableIngredient : pizza.pizzaIngredients) {

                    if (availableIngredient.name.equals(clientIngredientChoice)) {
                        ingredientToBeRemoved=availableIngredient;
                    }
                }
                pizza.pizzaIngredients.remove(ingredientToBeRemoved);
            }
            System.out.println("Do you want to change something else [yes]");
            doYouAlterIngredients = scanner.nextLine();
        }
    }
}