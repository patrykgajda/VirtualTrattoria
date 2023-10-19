package DAO;

import Model.ClientOrder;

import java.util.ArrayList;

public interface ClientOrderDao {
    ArrayList<ClientOrder> getAllClientOrder();
    void addClientOrder(int clientOrderNo, int clientNo, String clientName, String orderedPizzaName, String pizzaIngredients);
    String getClientOrderPizzaIngredients();
    int getLastInsertedClientOrderNo();
    int setNextClientOrderNo();
    int getClientOrderNo();
    int getClientNo();
    void setClientNo(int clientNo);
    String getClientName();
    void setClientName(String clientName);
    String getPizzaName();
    String getPizzaIngredients();
    void setPizzaIngredients(String pizzaIngredientsAfterAltering);
}