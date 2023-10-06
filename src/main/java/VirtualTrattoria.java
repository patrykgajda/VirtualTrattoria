import Controller.*;
import Model.ClientModel;
import Model.ClientOrderModel;
import View.ClientOrderView;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class VirtualTrattoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ClientOrderModel model = retrieveDummyClientOrderModelData();
        ClientOrderView view = new ClientOrderView();
        ClientOrderController ClientOrdercontroller = new ClientOrderController(model,view);
        ClientOrdercontroller.showCurrentView();

        ClientModel clientModel = retrieveDummyClientModelData();
        ClientController clientController = new ClientController(clientModel);

// Adding client and his order + presenting Controller.Menu
        System.out.println("Hi, what's your name?");
        ClientOrder clientOrder = new ClientOrder();
        Menu menu = new Menu();
        menu.showMenu();

        ArrayList<Pizza> pizzaListOrderedByClient = clientOrder.pizzaListOrderedByClient();

        try {
            CreateCSVFile.createNewCSVFile("clientOrder.csv", clientController, pizzaListOrderedByClient);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Client " + clientController.getClientName() + " ordered:");
        ClientOrderSummary.clientOrderSummary(pizzaListOrderedByClient);
    }

    private static ClientOrderModel retrieveDummyClientOrderModelData() {
        ClientOrderModel model = new ClientOrderModel();
        model.setClientNo(1);
        model.setClientName("Patryk");
        model.setOrderedPizzaName("Calzone");
        model.setPizzaIngredientsAfterAltering("Tomato Sauce, Cheese, Demo");
        return model;
    }
    private static ClientModel retrieveDummyClientModelData() {
        ClientModel model = new ClientModel();
        model.setClientNo(1);
        model.setClientName("Patryk");
        return model;
    }
}
