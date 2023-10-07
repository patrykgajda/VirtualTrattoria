package DAO;

import Model.PizzaModel;

import java.util.ArrayList;

public interface PizzaModelDao {
    public ArrayList<PizzaModel> getAllPizzas();
    public PizzaModel getPizzaModel(int pizzaNo);
}
