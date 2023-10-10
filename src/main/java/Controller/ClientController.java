package Controller;

import Model.ClientModel;
import Service.AddClientModelService;
import Service.AddClientModelServiceImpl;
import Service.GetClientModelService;
import Service.GetClientModelServiceImpl;
import View.AddClientView;
import View.GetClientView;

// should I separate ClientController to AddClientController and GetClientController?
// Can I create scanner in Controller or should it be in service
public class ClientController {
    private AddClientModelService addClientModelService = new AddClientModelServiceImpl();
    private GetClientModelService getClientModelService = new GetClientModelServiceImpl();
    private AddClientView addClientView;
    private GetClientView getClientView;

    public ClientController(AddClientView addClientView, GetClientView getClientView) {
        this.addClientView = addClientView;
        this.getClientView = getClientView;
    }

    // is it ok or should it be 3 separated methods?
    public void addClientModel() {
        addClientView.printWhatsYourName();
        addClientModelService.addClientModel();
        addClientView.printCreatedClientData(addClientModelService.getLastInsertedClientNo());
    }
    // is it ok to create ClientModel here:

    public void getClientModel(){
        getClientView.printWhatIsYourNumber();
        ClientModel clientModel = getClientModelService.getClientModel();
        getClientView.printGetClientName(clientModel.getClientNo(),clientModel.getClientName());
    }
//    not in use:
//    public String getClientName(){
//        getClientView.printWhatIsYourNumber();
//        return getClientModelService.getClientModel().getClientName();
//    }

}