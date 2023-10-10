package DAO;

import Model.ClientModel;

import java.util.ArrayList;

public interface ClientModelDao {

    public ArrayList<ClientModel> getAllClientsModel();
    public void addClientModel(int clientModelNo, String clientModelName);
    // is it ok I have int in DAO?
    public int getLastInsertedClientNo();
    public ClientModel getClientModel(int clientNo);

}
