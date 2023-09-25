import java.util.LinkedList;

public abstract class Pizza {

    static Ingredients[] availableIngredients = Ingredients.values();
    LinkedList<Ingredients> pizzaIngredients = new LinkedList<>();
    abstract AvailablePizza getPizzaName();

    public String getPizzaIngredients(){
        StringBuilder sb = new StringBuilder();
        for (Ingredients ingredient : pizzaIngredients) {
            sb.append(ingredient.name).append(" ");
        }
        return sb.toString();
    }

}
