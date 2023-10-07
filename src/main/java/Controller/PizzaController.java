package Controller;

import Model.PizzaModel;
import Service.PizzaMenuService;
import Service.PizzaMenuServiceImpl;
import View.PizzaView;

public class PizzaController {

    private PizzaMenuService pizzaMenuService = new PizzaMenuServiceImpl();
    private PizzaView pizzaView;

    public PizzaController(PizzaView pizzaView) {
        this.pizzaView = pizzaView;
    }

    public PizzaMenuService getPizzaMenuService() {
        return pizzaMenuService;
    }
    public void updateShowPizzaMenu() {
        for (PizzaModel pizzaModel : getPizzaMenuService().getAllPizza()){
            pizzaView.showPizzaMenu(pizzaModel.getPizzaNo(), pizzaModel.getPizzaName(), pizzaModel.getPizzaIngredients());
        }
    }
}