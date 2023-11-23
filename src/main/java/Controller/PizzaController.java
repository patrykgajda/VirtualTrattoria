package Controller;

import Model.Pizza;
import Service.*;
import View.PizzaView;
public class PizzaController {
    private final PizzaMenuService pizzaMenuService = new PizzaMenuServiceImpl();
    private final IngredientsService ingredientsService = new IngredientsServiceImpl();
    private final PizzaView pizzaView = new PizzaView();

    public PizzaMenuService getPizzaMenuService() {
        return pizzaMenuService;
    }
    public void updateShowPizzaMenu() {
        for (Pizza pizza : getPizzaMenuService().getAllPizza()){
            pizzaView.printPizzaMenu(pizza.pizzaNo(), pizza.pizzaName(), pizza.pizzaIngredients());
        }
    }
    public void printAvailableIngredients() {
        pizzaView.printAvailableIngredients(ingredientsService.getAllIngredientsNamesArrayList());
    }
}