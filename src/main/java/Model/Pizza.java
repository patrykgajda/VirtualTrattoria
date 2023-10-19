package Model;

public class Pizza {
    // should I make it record?
    private final int pizzaNo;
    private final String pizzaName;
    private final String pizzaIngredients;

    public Pizza(int pizzaNo, String pizzaName, String pizzaIngredients) {
        this.pizzaNo = pizzaNo;
        this.pizzaName = pizzaName;
        this.pizzaIngredients = pizzaIngredients;
    }

    public int getPizzaNo() {
        return pizzaNo;
    }
    public String getPizzaName() {
        return pizzaName;
    }
    public String getPizzaIngredients() {
        return pizzaIngredients;
    }

}
