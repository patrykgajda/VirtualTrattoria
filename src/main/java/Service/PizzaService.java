package Service;

import java.util.ArrayList;

public interface PizzaService {
    ArrayList<Integer> getAllPizzasNo();
    String getPizzaName(int pizzaNo);
    String getPizzaIngredients(int pizzaNo);

}
