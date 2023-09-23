import java.util.LinkedList;

public abstract class Pizza {

    static Ingredients[] availableIngredients = Ingredients.values();
    LinkedList<Ingredients> pizzaIngredients = new LinkedList<>();

    abstract AvailablePizza getPizzaName();
}
