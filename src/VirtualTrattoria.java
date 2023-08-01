import java.util.Scanner;

public class VirtualTrattoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what's your name?");
        UserName newUser = new UserName(scanner.nextLine());
        System.out.println("What pizza would you like to eat?");
        System.out.println(PizzaType.CAPRICIOSA + " / " + PizzaType.MARGHERITA + " / " + PizzaType.CALZONE);
        Pizza userOrdered = new Pizza();


    }
}
