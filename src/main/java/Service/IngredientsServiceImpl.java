package Service;

import DAO.IngredientsDao;
import DAO.IngredientsDaoImpl;
import Model.Ingredients;


import java.util.ArrayList;
import java.util.stream.Collectors;

public class IngredientsServiceImpl implements IngredientsService{
    private final IngredientsDao ingredients = new IngredientsDaoImpl();

    @Override
    public ArrayList<String> getAllIngredientsNamesArrayList() {
        return ingredients.getAllIngredientsArrayList().stream()
                .map(Ingredients::getIngredientName).collect(Collectors.toCollection(ArrayList::new));
    }
}
