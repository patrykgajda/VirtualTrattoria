package Service;

import DAO.ClientDao;
import DAO.ClientDaoImpl;
import Model.Client;


import java.util.ArrayList;

public class ClientServiceImpl implements ClientService {
    private final ClientDao clientDao = new ClientDaoImpl();

    @Override
    public ArrayList<Client> getAllClients() {
        return clientDao.getAllClients();
    }

    @Override
    public ArrayList<Integer> getAllClientsNo(int clientNo) {
        ArrayList<Integer> clientNoArrayList = new ArrayList<>();
        for (Client client : clientDao.getAllClients()) {
            clientNoArrayList.add(client.getClientNo());
        }
        return clientNoArrayList;
    }

    @Override
    public Client getClient(int clientNo) {
        return clientDao.getClient(clientNo - 1); // -1 because List starts with 0
    }
    @Override
    public void addClient(String clientName) {
        clientDao.setClientName(clientName);
        clientDao.addClient(setNextClientNo(), clientDao.getClientName());
    }
    @Override
    public int getLastInsertedClientNo() {
        return clientDao.getLastInsertedClientNo();
    }

    @Override
    public int getClientNo() {
        return clientDao.getClientNo();
    }

    private int setNextClientNo(){
        if (clientDao.getAllClients().isEmpty()) {
            return 1;
        }
        int nextClientNo = clientDao.getAllClients().get(clientDao.getAllClients().size()-1).getClientNo();
        return nextClientNo + 1;
    }
}
