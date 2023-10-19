package Controller;

import Model.ClientOrder;
import Service.*;
import View.ClientOrderView;
import View.GetClientView;

import java.util.Scanner;

public class ClientOrderController {
    Scanner scanner = new Scanner(System.in);
    private ClientService clientService = new ClientServiceImpl();
    private final ClientOrderService clientOrderService = new ClientOrderServiceImpl();
    private final PizzaService pizzaService = new PizzaServiceImpl();
    private final GetClientView getClientView = new GetClientView();
    private final ClientOrderView clientOrderView = new ClientOrderView();
    private int clientNo;

    // couldn't figure out how can I fix list reset
    public void setClientService(ClientService clientService){
        this.clientService = clientService;
    }
    public void addClientOrder(){
        clientOrderService.setClientService(clientService); // couldn't figure out how can I fix list reset
        getClientView.printWhatIsYourNumber();
        clientNo = scanner.nextInt();
        // how does try - catch work I tried to use it here but it saves data and it block 2nd use of AddClientOrder
        if (clientOrderService.clientNoValidation(clientNo)) {
            addClientOrderPizza();
        } else {
            clientOrderView.printSelectedIncorrectClientNo();
            addClientOrder();
        }
    }
    private void addClientOrderPizza() {
        getClientView.printWhatIsYourPizzaChoice();
        int pizzaNo = scanner.nextInt();
        scanner.nextLine(); // adding to reset scanner.nextInt
        if (clientOrderService.pizzaChoiceValidation(pizzaNo)) {
            clientOrderService.addClientOrder(clientService.getClient(clientNo).getClientNo(), clientService.getClient(clientNo).getClientName(), pizzaService.getPizzaName(pizzaNo), pizzaService.getPizzaIngredients(pizzaNo));
            updateClientOrder();
        } else {
            clientOrderView.printSelectedIncorrectPizzaNo();
            addClientOrderPizza();
        }
    }
    private void updateClientOrder(){
        String decision;
        do {
            clientOrderView.printWhatIsNextDecision();
            decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("new")) {
                updateClientOrderPizza();
            } else if (decision.equalsIgnoreCase("add") || decision.equalsIgnoreCase("remove")) {
                clientOrderView.printSelectIngredient(decision);
                String ingredient = scanner.nextLine().toLowerCase();
                if (clientOrderService.initUpdateClientOrderPizzaIngredients(decision,ingredient)) {
                    clientOrderService.updateClientOrderPizzaIngredients(decision, ingredient);
                } else clientOrderView.printIncorrectIngredient();
            }
        } while (!decision.equalsIgnoreCase("finish"));
        clientOrderView.printInitClientOrderView(clientOrderService.getClientName());
        for (ClientOrder clientOrder : clientOrderService.getClientOrder()) {
            clientOrderView.printClientOrderView(clientOrder.getPizzaName(), clientOrder.getPizzaIngredients());
        }
    }
    private void updateClientOrderPizza() {
        getClientView.printWhatIsYourPizzaChoice();
        int pizzaNo = scanner.nextInt();
        scanner.nextLine(); // adding to reset scanner.nextInt
        if (clientOrderService.pizzaChoiceValidation(pizzaNo)) {
            clientOrderService.addPizzaToCurrentClientOrder(clientService.getClient(clientNo).getClientNo(), clientService.getClient(clientNo).getClientName(), pizzaService.getPizzaName(pizzaNo), pizzaService.getPizzaIngredients(pizzaNo));
        } else {
            clientOrderView.printSelectedIncorrectPizzaNo();
            updateClientOrderPizza();
        }
    }
}
