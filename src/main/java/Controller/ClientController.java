package Controller;

import Model.Client;
import Service.ClientService;
import Service.ClientServiceImpl;
import View.AddClientView;
import View.GetClientView;

import java.util.Scanner;
public class ClientController {
    Scanner scanner = new Scanner(System.in);
    private ClientService clientService = new ClientServiceImpl();
    private final AddClientView addClientView = new AddClientView();
    private final GetClientView getClientView = new GetClientView();

    public void addClient() {
        addClientView.printWhatsYourName();
        clientService.addClient(scanner.nextLine());
        addClientView.printCreatedClientData(clientService.getLastInsertedClientNo());
    }
    public void getAllClients(){
        for (Client client : clientService.getAllClients()){
            getClientView.printGetAllClients(client.getClientNo(), client.getClientName());
        }
    }
    // couldn't figure out how can I fix list reset
    public void setClientService(ClientService clientService){
        this.clientService = clientService;
    }
}