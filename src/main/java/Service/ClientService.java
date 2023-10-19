package Service;

import Model.Client;

import java.util.ArrayList;

public interface ClientService {
    ArrayList<Client> getAllClients();
    ArrayList<Integer> getAllClientsNo(int clientNo);
    Client getClient(int clientNo);
    void addClient(String clientName);
    int getLastInsertedClientNo();
    int getClientNo();
}
