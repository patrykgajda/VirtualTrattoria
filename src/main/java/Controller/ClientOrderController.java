package Controller;

import Model.ClientOrder;
import Service.*;
import View.ClientOrderView;
import View.GetClientView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientOrderController {
    Scanner scanner = new Scanner(System.in);
    private final ClientService clientService;
    private final ClientOrderService clientOrderService = new ClientOrderServiceImpl();
    private final PizzaService pizzaService = new PizzaServiceImpl();
    private final GetClientView getClientView = new GetClientView();
    private final ClientOrderView clientOrderView = new ClientOrderView();
    private int clientNo;
    private int pizzaNo;
    private boolean incorrectInput = true;

    public ClientOrderController(ClientService clientService) {
        this.clientService = clientService;
    }

    public void addClientOrder(){
        clientOrderService.setClientService(clientService);
        getClientView.printWhatIsYourNumber();
        incorrectInput = true;
        while(incorrectInput) {
            try {
                incorrectInput = false;
                clientNo = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value. Please enter a number");
                scanner.next(); //scanner clear
                incorrectInput = true;
            }
        }
        if (clientOrderService.clientNoValidation(clientNo)) {
            addClientOrderPizza();
        } else {
            clientOrderView.printSelectedIncorrectClientNo();
            addClientOrder();
        }
    }
    private void addClientOrderPizza() {
        getClientView.printWhatIsYourPizzaChoice();
        pizzaNoIntCheck();
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
        pizzaNoIntCheck();
        if (clientOrderService.pizzaChoiceValidation(pizzaNo)) {
            clientOrderService.addPizzaToCurrentClientOrder(clientService.getClient(clientNo).getClientNo(), clientService.getClient(clientNo).getClientName(), pizzaService.getPizzaName(pizzaNo), pizzaService.getPizzaIngredients(pizzaNo));
        } else {
            clientOrderView.printSelectedIncorrectPizzaNo();
            updateClientOrderPizza();
        }
    }
    private void pizzaNoIntCheck() {
        incorrectInput = true;
        while (incorrectInput) {
            try {
                incorrectInput = false;
                pizzaNo = scanner.nextInt();
                scanner.nextLine(); //scanner clear - it was breaking UpdateClientOrder without this
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value. Please enter a number");
                scanner.next(); //scanner clear
                incorrectInput = true;
            }
        }
    }
}