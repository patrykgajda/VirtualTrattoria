package View;


import java.util.List;

public class PizzaView {

    public void printPizzaMenu(int pizzaNo, String pizzaName, String pizzaIngredients){
        System.out.println("Pizza: [No : " + pizzaNo + ", Name : " + pizzaName + ", Ingredients: " + pizzaIngredients + "]");
    }
    public void printAvailableIngredients(List<String> availableIngredients){
        System.out.println("Those are available ingredients: " + availableIngredients);
    }
}
