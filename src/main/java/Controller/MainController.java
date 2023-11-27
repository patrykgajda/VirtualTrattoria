package Controller;

import Service.ClientService;
import Service.ClientServiceImpl;

public class MainController {
    private final ClientService clientService = new ClientServiceImpl();
    private final ClientController clientController = new ClientController(clientService);
    private final ClientOrderController clientOrderController = new ClientOrderController(clientService);
    public void processClient(){
        clientController.processClient();
    }
    public void processClientOrder(){
        clientOrderController.addClientOrder();
    }
    public void showPizzaMenu(){
        System.out.println("Here is our Menu: ");
        PizzaController pizzaController = new PizzaController();
        pizzaController.updateShowPizzaMenu();
        pizzaController.printAvailableIngredients();
    }
}
