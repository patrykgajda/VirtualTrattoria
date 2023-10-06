package Model;

public class PizzaModel {
    private int pizzaNo;
    private String pizzaName;
    private String pizzaIngredients;

    public PizzaModel(int pizzaNo, String pizzaName, String pizzaIngredients) {
        this.pizzaNo = pizzaNo;
        this.pizzaName = pizzaName;
        this.pizzaIngredients = pizzaIngredients;
    }

    public int getPizzaNo() {
        return pizzaNo;
    }

    public void setPizzaNo(int pizzaNo) {
        this.pizzaNo = pizzaNo;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaIngredients() {
        return pizzaIngredients;
    }

    public void setPizzaIngredients(String pizzaIngredients) {
        this.pizzaIngredients = pizzaIngredients;
    }
}
