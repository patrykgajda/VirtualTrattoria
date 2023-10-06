package Controller;

import java.util.ArrayList;

public class ClientOrderSummary {

    public static void clientOrderSummary(ArrayList<Pizza> clientOrderList){
        for (Pizza orderedPizza : clientOrderList) {
            System.out.println(orderedPizza.getPizzaName() + " " + orderedPizza.pizzaIngredients);
        }
    }
}
