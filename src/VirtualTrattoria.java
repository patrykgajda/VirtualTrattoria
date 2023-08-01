import java.util.Scanner;

public class VirtualTrattoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name?");
        UserName newUser = new UserName(scanner.nextLine());
        ourMenu();

        Pizza userOrdered = getOrderforPizza();
        userOrdered.pizza();

    }

    private static void ourMenu() {
        System.out.println("What pizza would you like to eat?");
        System.out.println(PizzaType.CAPRICIOSA + " / marg / calz");
    }
    private static Pizza getOrderforPizza(PizzaType type) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        (userChoice.equals(PizzaType.CAPRICIOSA.name)) ? return new Capriciosa(); : System.out.println("User nie je");
    }
}
