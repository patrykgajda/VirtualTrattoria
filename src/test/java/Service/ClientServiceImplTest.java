package Service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientServiceImplTest {

    @Test
    void getLastInsertedClientNo() {
        var clientService = new ClientServiceImpl();
        assertEquals(1,clientService.getLastInsertedClientNo());
    }
}