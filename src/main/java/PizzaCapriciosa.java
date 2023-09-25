public class PizzaCapriciosa extends Pizza {
    private final AvailablePizza availablePizza = AvailablePizza.CAPRICIOSA;
    PizzaCapriciosa() {
        this.pizzaIngredients.add(Ingredients.TOMATOSAUCE);
        this.pizzaIngredients.add(Ingredients.CHEESE);
        this.pizzaIngredients.add(Ingredients.HAM);
        this.pizzaIngredients.add(Ingredients.MUSHROOM);
    }

    public AvailablePizza getPizzaName() {
        return availablePizza;
    }
}
