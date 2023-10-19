package DAO;

import Model.Client;

import java.util.ArrayList;

public interface ClientDao {

    ArrayList<Client> getAllClients();
    void addClient(int clientModelNo, String clientModelName);
    int getLastInsertedClientNo();
    Client getClient(int clientNo);
    void setClientName(String clientName);
    String getClientName();
    void setClientNo(int clientNo);
    int getClientNo();
}