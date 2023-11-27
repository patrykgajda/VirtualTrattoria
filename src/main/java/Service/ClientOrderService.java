package Service;

import Model.ClientOrder;

import java.util.ArrayList;

public interface ClientOrderService {
    ArrayList<ClientOrder> getAllClientOrder();
    ArrayList<ClientOrder> getClientOrder();
    void addClientOrder(int clientNo, String clientName, String orderedPizzaName, String pizzaIngredients);
    void addPizzaToCurrentClientOrder(int clientNo, String clientName, String orderedPizzaName, String pizzaIngredients);
    boolean initUpdateClientOrderPizzaIngredients(String decision, String ingredient);
    void updateClientOrderPizzaIngredients(String decision, String ingredient);
    int getClientNo();
    void setClientNo(int clientNo);
    String getClientName();
    void setClientName(String clientName);
    String getPizzaName();
    boolean pizzaChoiceValidation(int pizzaNo);
    boolean clientNoValidation(int clientNo);
    void setClientService(ClientService clientService);
}
