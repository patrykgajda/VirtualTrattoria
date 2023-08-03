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
        pizzaIngredients.add(Ingredients.MOZARELLA);
        pizzaIngredients.add(Ingredients.PROSCIUTTO);
    }

    public void addTomatoSauceIngredient() {
        pizzaIngredients.add(Ingredients.TOMATOSAUCE);
    }
    public void addCheeseIngredient() {
        pizzaIngredients.add(Ingredients.CHEESE);
    }
    public void addHamIngredient() {
        pizzaIngredients.add(Ingredients.HAM);
    }
    public void addMushroomIngredient() {
        pizzaIngredients.add(Ingredients.MUSHROOM);
    }
    public void addProsciuttoIngredient() {
        pizzaIngredients.add(Ingredients.PROSCIUTTO);
    }
    public void addMozarellaIngredient() {
        pizzaIngredients.add(Ingredients.MOZARELLA);
    }
    public void removeTomatoSauceIngredient() {
        pizzaIngredients.remove(Ingredients.TOMATOSAUCE);
    }
    public void removeCheeseIngredient() {
        pizzaIngredients.remove(Ingredients.CHEESE);
    }
    public void removeHamIngredient() {
        pizzaIngredients.remove(Ingredients.HAM);
    }
    public void removeMushroomIngredient() {
        pizzaIngredients.remove(Ingredients.MUSHROOM);
    }
    public void removeProsciuttoIngredient() {
        pizzaIngredients.remove(Ingredients.PROSCIUTTO);
    }
    public void removeMozarellaIngredient() {
        pizzaIngredients.remove(Ingredients.MOZARELLA);
    }
}
