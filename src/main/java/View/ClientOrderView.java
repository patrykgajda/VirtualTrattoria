package View;

public class ClientOrderView {
    public void printClientOrderView(int clientNo, String clientName, String pizzaName, String pizzaIngredients){
        System.out.println("Here are order details: ");
        System.out.println(clientNo + " Client " + clientName + " ordered: " + pizzaName);
        System.out.println("It has: " + pizzaIngredients);
    }
}