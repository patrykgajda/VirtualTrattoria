package Controller;

import Model.Client;
import Service.ClientService;
import View.AddClientView;
import View.GetClientView;

import java.util.Scanner;
public class ClientController {
    Scanner scanner = new Scanner(System.in);
    private final ClientService clientService;
    private final AddClientView addClientView = new AddClientView();
    private final GetClientView getClientView = new GetClientView();

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    public void processClient() {
        addClient();
        getAllClients();
    }
    private void addClient() {
        addClientView.printWhatsYourName();
        clientService.addClient(scanner.nextLine());
        addClientView.printCreatedClientData(clientService.getLastInsertedClientNo());
    }
    private void getAllClients(){
        for (Client client : clientService.getAllClients()){
            getClientView.printGetAllClients(client.getClientNo(), client.getClientName());
        }
    }
}