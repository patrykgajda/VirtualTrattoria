package Controller;

import Model.ClientOrderModel;
import View.ClientOrderView;

public class ClientOrderController {
    private ClientOrderModel model;
    private ClientOrderView view;

    public ClientOrderController(ClientOrderModel model, ClientOrderView view) {
        this.model = model;
        this.view = view;
    }
    public int getClientNo() {
        return model.getClientNo();
    }

    public void setClientNo(int clientNo) {
        model.setClientNo(clientNo);
    }

    public String getClientName() {
        return model.getClientName();
    }

    public void setClientName(String clientName) {
        model.setClientName(clientName);
    }

    public String getPizzaName() {
        return model.getOrderedPizzaName();
    }

    public void setPizzaName(String pizzaName) {
        model.setOrderedPizzaName(pizzaName);
    }

    public String getPizzaIngredients() {
        return model.getPizzaIngredientsAfterAltering();
    }

    public void setPizzaIngredients(String pizzaIngredients) {
        model.setPizzaIngredientsAfterAltering(pizzaIngredients);
    }
    public void showCurrentView(){
        view.printClientOrderView(model.getClientNo(),model.getClientName(),model.getOrderedPizzaName(),model.getPizzaIngredientsAfterAltering());
    }
}
