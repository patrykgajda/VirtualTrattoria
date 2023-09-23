import java.util.Arrays;

public enum AvailablePizza {
    CAPRICIOSA("capriciosa", Ingredients.TOMATOSAUCE, Ingredients.CHEESE, Ingredients.HAM, Ingredients.MUSHROOM),
    MARGHERITA("margherita", Ingredients.TOMATOSAUCE, Ingredients.CHEESE),
    CALZONE("calzone", Ingredients.TOMATOSAUCE, Ingredients.CHEESE, Ingredients.PROSCIUTTO);

    final String name;
    final String basicPizzaIngredients;
    AvailablePizza(String name, Ingredients ... basicIngredient) {
        this.name = name;
        this.basicPizzaIngredients = Arrays.toString(basicIngredient);
    }
}