import Controller.*;
import DAO.PizzaModelDao;
import DAO.PizzaModelDaoImpl;
import Model.ClientModel;
import Model.ClientOrderModel;
import Model.PizzaModel;
import View.AddClientView;
import View.ClientOrderView;
import View.PizzaView;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class VirtualTrattoria {

    public static void main(String[] args) {

        AddClientView addClientView = new AddClientView();
        ClientController clientController = new ClientController(addClientView);
        clientController.addClientModel();
        clientController.addClientModel();
        clientController.addClientModel();

        System.out.println("Here is our Menu: ");
        PizzaView pizzaView = new PizzaView();
        PizzaController pizzaController = new PizzaController(pizzaView);
        pizzaController.updateShowPizzaMenu();


// before MVC
//        ArrayList<Pizza> pizzaListOrderedByClient = clientOrder.pizzaListOrderedByClient();
//
//        try {
//            CreateCSVFile.createNewCSVFile("clientOrder.csv", clientController, pizzaListOrderedByClient);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("Client " + clientController.getClientName() + " ordered:");
//        ClientOrderSummary.clientOrderSummary(pizzaListOrderedByClient);
    }
}
