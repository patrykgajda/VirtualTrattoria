package View;

public class GetClientView {
    public void printWhatIsYourNumber(){
        System.out.println("What's your client number?");
    }
    public void printWhatIsYourPizzaChoice() {
        System.out.println("What is your pizza choice [type number]");
    }
    public void printGetAllClients(int clientNo, String clientName){
        System.out.println("Client no " + clientNo +  " is named " + clientName);
    }
}
