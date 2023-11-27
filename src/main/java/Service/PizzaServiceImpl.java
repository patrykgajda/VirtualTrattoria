package Service;

import DAO.PizzaDao;
import DAO.PizzaDaoImpl;
import Model.Pizza;

import java.util.ArrayList;


public class PizzaServiceImpl implements PizzaService{

    PizzaDao pizzaDao = new PizzaDaoImpl();


    @Override
    public ArrayList<Integer> getAllPizzasNo() {
        ArrayList<Integer> pizzaNoArrayList = new ArrayList<>();
        for (Pizza pizza : pizzaDao.getAllPizzas()) {
            pizzaNoArrayList.add(pizza.pizzaNo());
        }
        return pizzaNoArrayList;
    }

    @Override
    public String getPizzaName(int pizzaNo) {
        return pizzaDao.getPizzaName(pizzaNo);
    }

    @Override
    public String getPizzaIngredients(int pizzaNo) {
        return pizzaDao.getPizzaIngredients(pizzaNo);
    }
}
