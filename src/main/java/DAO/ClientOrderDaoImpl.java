package DAO;

import Model.ClientOrder;

import java.util.ArrayList;

public class ClientOrderDaoImpl implements ClientOrderDao{

    private final ArrayList<ClientOrder> clientOrderArrayList = new ArrayList<>();
    private ClientOrder clientOrder = new ClientOrder();

    @Override
    public ArrayList<ClientOrder> getAllClientOrder() {
        return clientOrderArrayList;
    }

    @Override
    public void addClientOrder(int clientOrderNo, int clientNo, String clientName, String orderedPizzaName, String pizzaIngredients) {
        ClientOrder newClientOrder = new ClientOrder();
        newClientOrder.setClientOrderNo(clientOrderNo);
        newClientOrder.setClientNo(clientNo);
        newClientOrder.setClientName(clientName);
        newClientOrder.setPizzaName(orderedPizzaName);
        newClientOrder.setPizzaIngredients(pizzaIngredients);
        clientOrderArrayList.add(newClientOrder);
        clientOrder = newClientOrder;
    }
    @Override
    public String getClientOrderPizzaIngredients() {
        return clientOrder.getPizzaIngredients();
    }

    @Override
    public int getLastInsertedClientOrderNo() {
        return clientOrderArrayList.get(clientOrderArrayList.size() - 1).getClientOrderNo();
    }

    @Override
    public int setNextClientOrderNo() {
        return clientOrderArrayList.get(clientOrderArrayList.size() - 1).getClientOrderNo() + 1;
    }

    @Override
    public int getClientOrderNo() {
        return clientOrder.getClientOrderNo();
    }

    @Override
    public int getClientNo() {
        return clientOrder.getClientNo();
    }

    @Override
    public void setClientNo(int clientNo) {
        clientOrder.setClientNo(clientNo);
    }

    @Override
    public String getClientName() {
        return clientOrder.getClientName();
    }

    @Override
    public void setClientName(String clientName) {
        clientOrder.setClientName(clientName);
    }

    @Override
    public String getPizzaName() {
        return clientOrder.getPizzaName();
    }

    @Override
    public String getPizzaIngredients() {
        return clientOrder.getPizzaIngredients();
    }

    @Override
    public void setPizzaIngredients(String pizzaIngredientsAfterAltering) {
        clientOrder.setPizzaIngredients(pizzaIngredientsAfterAltering);
    }
}
