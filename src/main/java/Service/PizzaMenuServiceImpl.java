package Service;

import DAO.PizzaModelDao;
import DAO.PizzaModelDaoImpl;
import Model.PizzaModel;

import java.util.ArrayList;

public class PizzaMenuServiceImpl implements PizzaMenuService {

    private PizzaModelDao pizzaModelDao = new PizzaModelDaoImpl();
    @Override
    public ArrayList<PizzaModel> getAllPizza() {
        return pizzaModelDao.getAllPizzas();
    }
}
