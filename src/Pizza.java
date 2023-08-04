import java.util.LinkedList;

public class Pizza {
    LinkedList<Ingredients> pizzaIngredients = new LinkedList<>();


    public void addMargheritaIngredients() {
        pizzaIngredients.add(Ingredients.TOMATOSAUCE);
        pizzaIngredients.add(Ingredients.CHEESE);
    }

    public void addCapriciosaIngredients() {
        pizzaIngredients.add(Ingredients.TOMATOSAUCE);
        pizzaIngredients.add(Ingredients.CHEESE);
        pizzaIngredients.add(Ingredients.HAM);
        pizzaIngredients.add(Ingredients.MUSHROOM);
    }

    public void addCalzoneIngredients() {
        pizzaIngredients.add(Ingredients.TOMATOSAUCE);
        pizzaIngredients.add(Ingredients.MOZZARELLA);
        pizzaIngredients.add(Ingredients.PROSCIUTTO);
    }
}