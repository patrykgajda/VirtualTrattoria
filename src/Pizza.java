import java.util.LinkedList;

public class Pizza {
    Ingredients[] availableIngredients = {Ingredients.TOMATOSAUCE, Ingredients.CHEESE, Ingredients.MOZZARELLA,Ingredients.MUSHROOM, Ingredients.HAM, Ingredients.PROSCIUTTO};
    LinkedList<Ingredients> pizzaIngredients = new LinkedList<>();
    PizzaName pizzaName;

    Pizza(PizzaName pizzaName){
        this.pizzaName=pizzaName;
    }

    public void addCapriciosaIngredients(){
        pizzaIngredients.add(Ingredients.TOMATOSAUCE);
        pizzaIngredients.add(Ingredients.CHEESE);
        pizzaIngredients.add(Ingredients.HAM);
        pizzaIngredients.add(Ingredients.MUSHROOM);
    }
    public void addMargheritaIngredients(){
        pizzaIngredients.add(Ingredients.TOMATOSAUCE);
        pizzaIngredients.add(Ingredients.CHEESE);
    }
    public void addCalzoneIngredients(){
        pizzaIngredients.add(Ingredients.TOMATOSAUCE);
        pizzaIngredients.add(Ingredients.MOZZARELLA);
        pizzaIngredients.add(Ingredients.PROSCIUTTO);
    }

}