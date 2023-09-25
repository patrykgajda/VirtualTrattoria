import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class VirtualTrattoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

// Adding client and his order + presenting Menu
        System.out.println("Hi, what's your name?");
        Clients newClient = new Clients(scanner.nextLine());
        ClientOrder clientOrder = new ClientOrder();
        Menu menu = new Menu();
        menu.showMenu();

        ArrayList<Pizza> pizzaListOrderedByClient = clientOrder.pizzaListOrderedByClient();

        try {
            CreateCSVFile.createNewCSVFile("saveDataToCSVFile.csv", newClient, pizzaListOrderedByClient);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Client " + newClient.getName() + " ordered:");
        ClientOrderSummary.clientOrderSummary(pizzaListOrderedByClient);
    }
}