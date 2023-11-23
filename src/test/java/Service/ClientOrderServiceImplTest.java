package Service;

import static org.junit.jupiter.api.Assertions.*;

class ClientOrderServiceImplTest {

    @org.junit.jupiter.api.Test
    void initUpdateClientOrderPizzaIngredientsReturnTrue() {
        var clientOrderService = new ClientOrderServiceImpl();
        assertTrue(clientOrderService.initUpdateClientOrderPizzaIngredients("add", "ham"));
    }
}