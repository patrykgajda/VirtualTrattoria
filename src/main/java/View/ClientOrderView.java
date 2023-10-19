package View;

public class ClientOrderView {

    public void printInitClientOrderView(String clientName){
        System.out.println("Here are " + clientName + " order details: ");
    }
    public void printClientOrderView(String pizzaName, String pizzaIngredients){
        System.out.println(pizzaName + " it has: " + pizzaIngredients);
    }
    public void printWhatIsNextDecision(){
        System.out.println("Would you like to order next pizza [new], alter current pizza ingredients [add/remove] or is that all [finish]");
    }
    public void printSelectIngredient(String decision) {
        System.out.println("What ingredient would you like to " + decision);
    }

    public void printIncorrectIngredient() {
        System.out.println("This ingredient is incorrect");
    }

    public void printSelectedIncorrectPizzaNo() {
        System.out.println("We don't have such pizza");
    }

    public void printSelectedIncorrectClientNo() {
        System.out.println("We don't have client with this number");
    }
}