package Controller;

import Model.ClientModel;

public class ClientController {
    private static int countClients = 0;
    private ClientModel client;
    public ClientController(ClientModel client) {
        ++countClients;
        client.setClientNo(countClients);
        this.client = client;
    }

    public String getClientName() {
        return client.getClientName();
    }
    public void setClientName(String clientName) {
        client.setClientName(clientName);
    }
    public int getClientNo() {
        return client.getClientNo();
    }
//    public void setClientNo() // should I go with classic setter or put countClients
}
