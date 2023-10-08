package DAO;

import Model.ClientModel;

import java.util.ArrayList;

public interface ClientModelDao {

    public ArrayList<ClientModel> getAllClientsModel();
    public void addClientModel(int clientModelNo, String clientModelName);
    public int getLastInsertedClientNo();
}
