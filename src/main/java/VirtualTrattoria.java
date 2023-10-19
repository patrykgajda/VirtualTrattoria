import Controller.*;
import Service.ClientService;
import Service.ClientServiceImpl;


public class VirtualTrattoria {

    public static void main(String[] args) {

        // couldn't figure out how can I fix list reset
        ClientService clientService = new ClientServiceImpl();

        ClientController clientController = new ClientController();
        clientController.setClientService(clientService); // couldn't figure out how can I fix list reset


        clientController.addClient();
        clientController.getAllClients();
        System.out.println();

//        clientController.addClient();
//        clientController.getAllClients();
//        System.out.println();
//
//        clientController.addClient();
//        clientController.getAllClients();
//        System.out.println();
//
//        clientController.addClient();
//        clientController.getAllClients();
//        System.out.println();

        System.out.println("Here is our Menu: ");
        PizzaController pizzaController = new PizzaController();
        pizzaController.updateShowPizzaMenu();
        pizzaController.printAvailableIngredients();

        ClientOrderController clientOrderController = new ClientOrderController();
        clientOrderController.setClientService(clientService); // couldn't figure out how can I fix list reset
        clientOrderController.addClientOrder();
        clientOrderController.addClientOrder();
        clientOrderController.addClientOrder();
    }
}