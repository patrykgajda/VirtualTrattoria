package Service;

import DAO.IngredientsDao;
import DAO.IngredientsDaoImpl;
import Model.Ingredients;

import java.util.ArrayList;

public class IngredientsServiceImpl implements IngredientsService{
    private final IngredientsDao ingredients = new IngredientsDaoImpl();

    @Override
    public ArrayList<String> getAllIngredientsNamesArrayList() {
        ArrayList<String> names = new ArrayList<>();
        for (Ingredients ingredient : ingredients.getAllIngredientsArrayList()) {
            String name = ingredient.getIngredientName();
            names.add(name);
        }
        return names;
    }
}
