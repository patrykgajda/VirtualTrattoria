package Service;

import DAO.ClientModelDao;
import DAO.ClientModelDaoImpl;
import Model.ClientModel;

import java.util.Scanner;

public class AddClientModelServiceImpl implements AddClientModelService{
    Scanner scanner = new Scanner(System.in);
    private ClientModelDao clientModelDao = new ClientModelDaoImpl();
    @Override
    public void addClientModel() {
        clientModelDao.addClientModel(setMaxClientNo(), setClientModelName());
    }

    @Override
    public int getLastInsertedClientNo() {
        return clientModelDao.getLastInsertedClientNo();
    }

    private int setMaxClientNo(){
        if (clientModelDao.getAllClientsModel().isEmpty()) {
            return 1;
        }
        int maxClientNo = clientModelDao.getAllClientsModel().get(clientModelDao.getAllClientsModel().size()-1).getClientNo();
        return maxClientNo + 1;
    }
    private String setClientModelName(){
//        System.out.println("What's your name: ");
        return scanner.nextLine();
    }
}
