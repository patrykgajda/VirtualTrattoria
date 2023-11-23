package Service;

import DAO.ClientOrderDao;
import DAO.ClientOrderDaoImpl;
import Model.ClientOrder;
import java.util.ArrayList;
import java.util.Arrays;

public class ClientOrderServiceImpl implements ClientOrderService{

    private final ClientOrderDao clientOrderDao = new ClientOrderDaoImpl();
    private final IngredientsService ingredientsService = new IngredientsServiceImpl();
    private final PizzaService pizzaService = new PizzaServiceImpl();
    private ClientService clientService = new ClientServiceImpl();

    @Override
    public ArrayList<ClientOrder> getAllClientOrder() {
        return clientOrderDao.getAllClientOrder();
    }

    @Override
    public ArrayList<ClientOrder> getClientOrder() {
        ArrayList<ClientOrder> specifiedClientOrder = new ArrayList<>();
        for (ClientOrder clientOrder1 : getAllClientOrder()){
            if (clientOrder1.getClientNo() == clientOrderDao.getClientNo() && clientOrder1.getClientOrderNo() == clientOrderDao.getClientOrderNo()) {
                specifiedClientOrder.add(clientOrder1);
            }
        } return specifiedClientOrder;
    }

    @Override
    public void addClientOrder(int clientNo, String clientName, String orderedPizzaName, String pizzaIngredients) {
        clientOrderDao.addClientOrder(setNextClientOrderNo(), clientNo, clientName, orderedPizzaName, pizzaIngredients);
    }
    @Override
    public void addPizzaToCurrentClientOrder(int clientNo, String clientName, String orderedPizzaName, String pizzaIngredients) {
        clientOrderDao.addClientOrder(getLastInsertedClientOrderNo(), clientNo, clientName, orderedPizzaName, pizzaIngredients);
    }
    @Override
    public boolean initUpdateClientOrderPizzaIngredients(String decision, String ingredient){
        if (decision.equalsIgnoreCase("add")) {
            for (String ingredientName : ingredientsService.getAllIngredientsNamesArrayList()){
                if (ingredientName.equalsIgnoreCase(ingredient)) return true;
            }
            return false;
        }
        ArrayList<String> pizzaIngredientsList = new ArrayList<>(Arrays.asList(clientOrderDao.getClientOrderPizzaIngredients().split(", ")));
        for (String checkIngredient : pizzaIngredientsList) {
            if (checkIngredient.equalsIgnoreCase(ingredient)) return true;
        }
        return false;
    }
    @Override
    public void updateClientOrderPizzaIngredients(String decision, String ingredient) {
        if (decision.equalsIgnoreCase("add")) {
            addPizzaIngredients(ingredient);
        } else if (decision.equalsIgnoreCase("remove")) {
            removePizzaIngredients(ingredient);
        }
    }
    @Override
    public int getClientNo() {
        return clientOrderDao.getClientOrderNo();
    }

    @Override
    public void setClientNo(int clientNo) {
        clientOrderDao.setClientNo(clientNo);
    }

    @Override
    public String getClientName() {
        return clientOrderDao.getClientName();
    }

    @Override
    public void setClientName(String clientName) {
        clientOrderDao.setClientName(clientName);
    }

    @Override
    public String getPizzaName() {
        return clientOrderDao.getPizzaName();
    }

    @Override
    public boolean pizzaChoiceValidation(int pizzaNo) {
        for (int number : pizzaService.getAllPizzasNo()) {
            if (pizzaNo == number) return true;
        }
        return false;
    }

    @Override
    public boolean clientNoValidation(int clientNo) {
        for (int number : clientService.getAllClientsNo(clientNo)) {
            if (clientNo == number) return true;
        }
        return false;
    }
    @Override
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    private int getLastInsertedClientOrderNo() {
        if (clientOrderDao.getAllClientOrder().isEmpty()){return 1;}
        return clientOrderDao.getLastInsertedClientOrderNo();
    }
    private int setNextClientOrderNo() {
        if (clientOrderDao.getAllClientOrder().isEmpty()){return 1;}
        return clientOrderDao.setNextClientOrderNo();
    }
    private void addPizzaIngredients(String ingredient){
        clientOrderDao.setPizzaIngredients(clientOrderDao.getClientOrderPizzaIngredients() + ", " + ingredient);
    }
    private void removePizzaIngredients(String ingredient){
        ArrayList<String> pizzaIngredientsList = new ArrayList<>(Arrays.asList(clientOrderDao.getClientOrderPizzaIngredients().split(", ")));
        for (String ingredientFromList : pizzaIngredientsList) {
            if (ingredientFromList.equalsIgnoreCase(ingredient)){
                pizzaIngredientsList.remove(ingredientFromList);
                break;
            }
        }
        clientOrderDao.setPizzaIngredients(pizzaIngredientsList.toString().substring(1, pizzaIngredientsList.toString().length() - 1));
    }
}
