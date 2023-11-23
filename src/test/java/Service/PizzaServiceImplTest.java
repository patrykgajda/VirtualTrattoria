package Service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PizzaServiceImplTest {

    @Test
    void getAllPizzasNo() {
        var pizzaService = new PizzaServiceImpl();
        ArrayList<Integer> correctPizzaNumbers= new ArrayList<>();
        correctPizzaNumbers.add(0,1);
        correctPizzaNumbers.add(1,2);
        correctPizzaNumbers.add(2,3);
        assertEquals(correctPizzaNumbers, pizzaService.getAllPizzasNo());
    }

    @Test
    void getPizzaName() {
        var pizzaService = new PizzaServiceImpl();
        assertEquals("Calzone", pizzaService.getPizzaName(3));
    }
}