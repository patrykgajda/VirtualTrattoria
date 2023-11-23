package DAO;

import Model.Pizza;

import java.util.ArrayList;

public class PizzaDaoImpl implements PizzaDao {

    private final ArrayList<Pizza> pizzaArrayList;
    public PizzaDaoImpl() {
        pizzaArrayList = new ArrayList<>();
        Pizza capriciosa = new Pizza(1, "Capriciosa", "Tomato Sauce, Cheese, Mushroom, Ham");
        Pizza margherita = new Pizza(2, "Margherita", "Tomato Sauce, Cheese");
        Pizza calzone = new Pizza(3, "Calzone", "Tomato Sauce, Cheese, Prosciutto");
        pizzaArrayList.add(capriciosa);
        pizzaArrayList.add(margherita);
        pizzaArrayList.add(calzone);
    }

    @Override
    public ArrayList<Pizza> getAllPizzas() {
        return pizzaArrayList;
    }

    @Override
    public String getPizzaName(int pizzaNo) {
        return pizzaArrayList.get(pizzaNo - 1).pizzaName();
    }

    @Override
    public String getPizzaIngredients(int pizzaNo) {
        return pizzaArrayList.get(pizzaNo - 1).pizzaIngredients();
    }

}
