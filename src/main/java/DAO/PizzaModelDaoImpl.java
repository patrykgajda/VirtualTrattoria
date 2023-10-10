package DAO;

import Model.PizzaModel;

import java.util.ArrayList;

public class PizzaModelDaoImpl implements PizzaModelDao{

    // List is as database - will try with excel s/s
    ArrayList<PizzaModel> pizzaModelArrayList;
    public PizzaModelDaoImpl() {
        pizzaModelArrayList = new ArrayList<>();
        PizzaModel capriciosa = new PizzaModel(1, "Capriciosoa", "Tomato Sauce, Cheese, Mushroom, Ham");
        PizzaModel margherita = new PizzaModel(2, "Margherita", "Tomato Sauce, Cheese");
        PizzaModel calzone = new PizzaModel(3, "Calzone", "Tomato Sauce, Cheese, Prosciutto");
        pizzaModelArrayList.add(capriciosa);
        pizzaModelArrayList.add(margherita);
        pizzaModelArrayList.add(calzone);
    }

    @Override
    public ArrayList<PizzaModel> getAllPizzas() {
        return pizzaModelArrayList;
    }

    @Override
    public PizzaModel getPizzaModel(int pizzaNo) {
        return pizzaModelArrayList.get(pizzaNo);
    }
}
