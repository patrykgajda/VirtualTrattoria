package DAO;

import Model.Client;

import java.util.ArrayList;

public class ClientDaoImpl implements ClientDao {
    // List is as database - will try with excel s/s
    private final ArrayList<Client> clientArrayList;
    private final Client client = new Client();

    public ClientDaoImpl() {
        clientArrayList = new ArrayList<>();
//        commented to make list null
        Client patryk = new Client();
        patryk.setClientNo(1);
        patryk.setClientName("Patryk");
        clientArrayList.add(patryk);
    }

    @Override
    public ArrayList<Client> getAllClients() {
        return clientArrayList;
    }

    @Override
    public void addClient(int clientModelNo, String clientModelName) {
        Client newClient = new Client();
        newClient.setClientNo(clientModelNo);
        newClient.setClientName(clientModelName);
        clientArrayList.add(newClient);
    }
    @Override
    public int getLastInsertedClientNo() {
        return clientArrayList.get(clientArrayList.size()-1).getClientNo();
    }
    @Override
    public Client getClient(int clientNo) {
        return clientArrayList.get(clientNo);
    }
    @Override
    public void setClientName(String clientName) {
        client.setClientName(clientName);
    }

    @Override
    public String getClientName() {
        return client.getClientName();
    }

    @Override
    public void setClientNo(int clientNo) {
        client.setClientNo(clientNo);
    }

    @Override
    public int getClientNo() {
        return client.getClientNo();
    }
}
