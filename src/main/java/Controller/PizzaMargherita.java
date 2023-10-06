package Controller;

public class PizzaMargherita extends Pizza {
    private final AvailablePizza availablePizza = AvailablePizza.MARGHERITA;

    public PizzaMargherita() {
        pizzaIngredients.add(Ingredients.TOMATOSAUCE);
        pizzaIngredients.add(Ingredients.CHEESE);
    }

    public AvailablePizza getPizzaName() {
        return availablePizza;
    }
}
