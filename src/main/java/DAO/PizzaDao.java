package DAO;

import Model.Pizza;

import java.util.ArrayList;

public interface PizzaDao {
    ArrayList<Pizza> getAllPizzas();
    String getPizzaName(int pizzaNo);
    String getPizzaIngredients(int pizzaNo);
}
