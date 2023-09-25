public class Clients {
    private final String name;
    private static int countClients = 0;
    private final int clientNo;
    public Clients(String name) {
        ++countClients;
        clientNo = countClients;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getClientNo() {
        return clientNo;
    }
}
