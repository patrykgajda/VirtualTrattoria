package Controller;

import Model.ClientModel;
import Service.AddClientModelService;
import Service.AddClientModelServiceImpl;
import View.AddClientView;

public class ClientController {
    private AddClientModelService addClientModelService = new AddClientModelServiceImpl();
    private ClientModel client;
    private AddClientView addClientView;

    public ClientController(AddClientView addClientView) {
        this.addClientView = addClientView;
    }

    public void addClientModel() {
        addClientView.printWhatsYourName();
        addClientModelService.addClientModel();
        addClientView.printCreatedClientData(addClientModelService.getLastInsertedClientNo());
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
}