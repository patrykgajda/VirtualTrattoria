import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class VirtualTrattoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String clientPizzaChoice;
        String availableIngredients[] = {Ingredients.TOMATOSAUCE.name, Ingredients.CHEESE.name, Ingredients.HAM.name, Ingredients.MUSHROOM.name, Ingredients.PROSCIUTTO.name, Ingredients.MUSHROOM.name};


        System.out.println("Hi, what's your name?");
        UserName newUser = new UserName(scanner.nextLine());
        System.out.println("What pizza would you like to eat?");
        System.out.println(PizzaType.CAPRICIOSA + " / " + PizzaType.MARGHERITA + " / " + PizzaType.CALZONE);
        Pizza pizza = new Pizza();

        clientPizzaChoice = scanner.nextLine().toLowerCase();

        if (clientPizzaChoice.equals(PizzaType.CAPRICIOSA.name)){
            pizza.addCapriciosaIngredients();
        } else {
            System.out.println("zaraz bd dalej");
        }

        System.out.println("Would you like to alter your ingredients");
        System.out.println("Those are available: " + Arrays.toString(availableIngredients));

        System.out.println("Your order: " + clientPizzaChoice + " it contains: " + pizza.pizzaIngredients);

    }
}
