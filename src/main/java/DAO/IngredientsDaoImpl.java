package DAO;

import Model.Ingredients;

import java.util.ArrayList;

public class IngredientsDaoImpl implements IngredientsDao{
    private final ArrayList<Ingredients> ingredientsArrayList;

    public IngredientsDaoImpl() {
        ingredientsArrayList = new ArrayList<>();
        Ingredients tomatoSauce = new Ingredients();
        tomatoSauce.setIngredientNo(1);
        tomatoSauce.setIngredientName("Tomato Sauce");
        Ingredients cheese = new Ingredients();
        cheese.setIngredientNo(2);
        cheese.setIngredientName("Cheese");
        Ingredients ham = new Ingredients();
        ham.setIngredientNo(3);
        ham.setIngredientName("Ham");
        Ingredients mushroom = new Ingredients();
        mushroom.setIngredientNo(4);
        mushroom.setIngredientName("Mushroom");
        Ingredients prosciutto = new Ingredients();
        prosciutto.setIngredientNo(5);
        prosciutto.setIngredientName("Prosciutto");
        Ingredients mozzarella = new Ingredients();
        mozzarella.setIngredientNo(6);
        mozzarella.setIngredientName("Mozzarella");
        ingredientsArrayList.add(tomatoSauce);
        ingredientsArrayList.add(cheese);
        ingredientsArrayList.add(ham);
        ingredientsArrayList.add(mushroom);
        ingredientsArrayList.add(prosciutto);
        ingredientsArrayList.add(mozzarella);
    }
    @Override
    public ArrayList<Ingredients> getAllIngredientsArrayList() {
        return ingredientsArrayList;
    }
}
