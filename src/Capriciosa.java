import java.util.LinkedList;

public class Capriciosa extends Pizza{

    LinkedList<String> capriciosaIngredients = new LinkedList<>();

    @Override
    public void addBasicIngredient() {
        capriciosaIngredients.add(tomatoSauce);
        capriciosaIngredients.add(cheese);
        capriciosaIngredients.add(ham);
        capriciosaIngredients.add(mushroom);
    }

    @Override
    public void addIngredient() {
        capriciosaIngredients.add(cheese);
    }
    @Override
    public void pizza() {
        addBasicIngredient();
        System.out.println("Your pizza Ingredients: " + capriciosaIngredients);
    }
}
