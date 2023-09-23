public class PizzaCalzone extends Pizza {
    private final AvailablePizza availablePizza = AvailablePizza.CALZONE;

    public PizzaCalzone() {
        pizzaIngredients.add(Ingredients.TOMATOSAUCE);
        pizzaIngredients.add(Ingredients.CHEESE);
        pizzaIngredients.add(Ingredients.PROSCIUTTO);
    }

    public AvailablePizza getPizzaName() {
        return availablePizza;
    }
}
