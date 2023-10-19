package Service;

import DAO.PizzaDao;
import DAO.PizzaDaoImpl;
import Model.Pizza;

import java.util.ArrayList;

public class PizzaMenuServiceImpl implements PizzaMenuService {

    private final PizzaDao pizzaDao = new PizzaDaoImpl();
    @Override
    public ArrayList<Pizza> getAllPizza() {
        return pizzaDao.getAllPizzas();
    }
}
