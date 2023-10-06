package Controller;

public class Menu {
    public void showMenu() {
        System.out.println("Here is our menu:");
        AvailablePizza[] availablePizza = AvailablePizza.values();
        for (AvailablePizza showPizza : availablePizza) {
            System.out.println(showPizza.name() + " " + showPizza.basicPizzaIngredients);
        }
    }
}
