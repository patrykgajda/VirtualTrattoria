package Model;
// to make sure:
// if this is Model - it should retrieve and store the state of the model in a database.
// can I create Pizza type or list? - I think no because I can't add Pizza type to DB, so I can use only those available in DB
public class ClientOrder {
    private int clientOrderNo;
    private int clientNo;
    private String clientName;
    private String orderedPizzaName;
    private String pizzaIngredients;

    public int getClientOrderNo(){
        return clientOrderNo;
    }
    public void setClientOrderNo(int clientOrderNo){
        this.clientOrderNo=clientOrderNo;
    }
    public int getClientNo() {
        return clientNo;
    }

    public void setClientNo(int clientNo) {
        this.clientNo = clientNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPizzaName() {
        return orderedPizzaName;
    }

    public void setPizzaName(String orderedPizzaName) {
        this.orderedPizzaName = orderedPizzaName;
    }

    public String getPizzaIngredients() {
        return pizzaIngredients;
    }
    public void setPizzaIngredients(String pizzaIngredientsAfterAltering) {
        this.pizzaIngredients = pizzaIngredientsAfterAltering;
    }
}
