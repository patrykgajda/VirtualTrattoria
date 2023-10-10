import Controller.*;
import View.AddClientView;
import View.GetClientView;
import View.PizzaView;

public class VirtualTrattoria {

    public static void main(String[] args) {

        AddClientView addClientView = new AddClientView();
        GetClientView getClientView = new GetClientView();
        ClientController clientController = new ClientController(addClientView, getClientView);

        // I have to change something in Service, because now Get/AddClientModelService both create new ClientModelDaoImpl();
        // it reset my ArrayList which is my DB now
        clientController.addClientModel();
        clientController.getClientModel();

        System.out.println("Here is our Menu: ");
        PizzaView pizzaView = new PizzaView();
        PizzaController pizzaController = new PizzaController(pizzaView);
        pizzaController.updateShowPizzaMenu();

    }
}
