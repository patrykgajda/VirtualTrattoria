import java.util.LinkedList;

public interface Pizza {
    Ingredients[] availableIngredients = {Ingredients.TOMATOSAUCE, Ingredients.CHEESE, Ingredients.MOZZARELLA,Ingredients.MUSHROOM, Ingredients.HAM, Ingredients.PROSCIUTTO};
    LinkedList<Ingredients> pizzaIngredients = new LinkedList<>();



}