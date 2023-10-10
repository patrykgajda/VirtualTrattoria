package Service;

import DAO.ClientModelDao;
import DAO.ClientModelDaoImpl;
import Model.ClientModel;

import java.util.Scanner;

public class GetClientModelServiceImpl implements GetClientModelService {
    private ClientModelDao clientModelDao = new ClientModelDaoImpl();
    private int clientNo;

    Scanner scanner = new Scanner(System.in);
    @Override
    public ClientModel getClientModel() {
        // exception to be added
        clientNo = scanner.nextInt() - 1; // -1 because List starts with 0
        return clientModelDao.getClientModel(clientNo);
    }

}
