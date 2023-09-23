import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ClientOrder {

    Scanner scanner = new Scanner(System.in);
    private String clientPizzaChoice;
    private String clientIngredientChoice;
    private ArrayList<Pizza> orderedPizzaList = new ArrayList<>();

    public void addPizzaToClientOrderList(){
        String addAnotherPizza;
        do {
            orderedPizzaList.add(setClientPizzaChoice());
            System.out.println("Would you like to add another pizza to your order [yes]");
            addAnotherPizza = scanner.nextLine().toLowerCase();
        } while (addAnotherPizza.equals("yes"));
    }
    public void clientOrderSummary(){
        for (Pizza orderedPizza : orderedPizzaList) {
            System.out.println(orderedPizza.getPizzaName() + " " + orderedPizza.pizzaIngredients);
        }
    }
    private Pizza setClientPizzaChoice() {
        do  {
            System.out.println("What pizza would you like to eat?");
            clientPizzaChoice = scanner.nextLine().toLowerCase();
        } while (!clientPizzaChoiceChecker(clientPizzaChoice));
        Pizza orderedPizza = orderPizza();
        doYouAlterOrderedPizzaIngredients(orderedPizza);
        return orderedPizza;
    }
    private boolean clientPizzaChoiceChecker(String clientPizzaChoice) {
        for (AvailablePizza pizzaName : AvailablePizza.values()) {
            if (clientPizzaChoice.equals(pizzaName.name)) {
                return true;
            }
        }
        System.out.println("We don't have such pizza");
        return false;
    }
    private Pizza orderPizza() {
        if (clientPizzaChoice.equals(AvailablePizza.CAPRICIOSA.name)) {
            return new PizzaCapriciosa();

        } else if (clientPizzaChoice.equals(AvailablePizza.MARGHERITA.name)) {
            return new PizzaMargherita();
        }
        {
            return new PizzaCalzone();
        }
    }

    private void doYouAlterOrderedPizzaIngredients(Pizza orderedPizza) {
        Scanner scanner = new Scanner(System.in);
        String doYouAlterIngredients;
        System.out.println("Would you like to alter your ingredients? [yes]");
        doYouAlterIngredients = scanner.nextLine();

        while (doYouAlterIngredients.equals("yes")) {
            System.out.println("Do you want to add or remove ingredient? [add/remove]");
            String addOrRemoveIngredients = scanner.nextLine();
// adding Ingredients
            if (addOrRemoveIngredients.equals("add")) {
                addIngredientToOrderedPizza(orderedPizza);
// removing Ingredients
            } else if (addOrRemoveIngredients.equals("remove")) {
                removeIngredientFromOrderedPizza(orderedPizza);
            }
            System.out.println("Do you want to change something else [yes]");
            doYouAlterIngredients = scanner.nextLine();
        }
    }
    private void addIngredientToOrderedPizza(Pizza orderedPizza){
        do {
            System.out.println("Those are available to add: " + Arrays.toString(Pizza.availableIngredients));
            System.out.println("What is your choice");
            clientIngredientChoice = scanner.nextLine().toLowerCase();
        } while (!pizzaIngredientChoiceChecker(clientIngredientChoice));
        for (Ingredients availableIngredient : Pizza.availableIngredients) {
            if (availableIngredient.name.equals(clientIngredientChoice)) {
                orderedPizza.pizzaIngredients.add(availableIngredient);
            }
        }
    }
    private void removeIngredientFromOrderedPizza(Pizza orderedPizza) {
        do {
            System.out.println("What should we remove?");
            clientIngredientChoice = scanner.nextLine().toLowerCase();
        } while (!pizzaIngredientChoiceChecker(clientIngredientChoice));
        Ingredients ingredientToBeRemoved = null;
        for (Ingredients availableIngredient : orderedPizza.pizzaIngredients) {
            if (availableIngredient.name.equals(clientIngredientChoice)) {
                ingredientToBeRemoved = availableIngredient;
            }
        }
        orderedPizza.pizzaIngredients.remove(ingredientToBeRemoved);
    }
    private boolean pizzaIngredientChoiceChecker(String clientIngredientChoice) {
        for (Ingredients availableIngredient : Pizza.availableIngredients) {
            if (availableIngredient.name.equals(clientIngredientChoice)) {
                return true;
            }
        }
        System.out.println("There is no such ingredient");
        return false;
    }
}
