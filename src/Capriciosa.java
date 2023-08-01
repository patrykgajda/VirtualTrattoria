import java.util.LinkedList;

public class Capriciosa extends Pizza{

    LinkedList<Ingredients> capriciosaIngredients = new LinkedList<>();

    @Override
    public void addBasicIngredient() {
        capriciosaIngredients.add(Ingredients.TOMATOSAUCE);
        capriciosaIngredients.add(Ingredients.CHEESE);
        capriciosaIngredients.add(Ingredients.HAM);
        capriciosaIngredients.add(Ingredients.MUSHROOM);
    }


    @Override
    public void addIngredient() {
        capriciosaIngredients.add(Ingredients.);
    }
    @Override
    public void pizza() {
        addBasicIngredient();
        System.out.println("Your pizza Ingredients: " + capriciosaIngredients);
    }
}
