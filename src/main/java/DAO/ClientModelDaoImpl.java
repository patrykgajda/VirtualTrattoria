package DAO;

import Model.ClientModel;

import java.util.ArrayList;

public class ClientModelDaoImpl implements ClientModelDao {
    // List is as database - will try with excel s/s
    private ArrayList<ClientModel> clientModelArrayList;
    private ClientModel clientModel = new ClientModel();

    public ClientModelDaoImpl() {
        clientModelArrayList = new ArrayList<>();
//        commented to make list null
        ClientModel patryk = new ClientModel();
        patryk.setClientNo(1);
        patryk.setClientName("Patryk");
        clientModelArrayList.add(patryk);
    }

    @Override
    public ArrayList<ClientModel> getAllClientsModel() {
        return clientModelArrayList;
    }

    @Override
    public void addClientModel(int clientModelNo, String clientModelName) {
        clientModel.setClientNo(clientModelNo);
        clientModel.setClientName(clientModelName);
        clientModelArrayList.add(clientModel);
    }
    @Override
    public int getLastInsertedClientNo() {
        return clientModelArrayList.get(clientModelArrayList.size()-1).getClientNo();
    }
    @Override
    public ClientModel getClientModel(int clientNo) {
        return clientModelArrayList.get(clientNo);
    }
}
