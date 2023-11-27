import Controller.*;
public class VirtualTrattoria {

    public static void main(String[] args) {


        MainController mainController = new MainController();
        mainController.processClient();

//        mainController.processClient();
//        System.out.println();

//        mainController.processClient();
//        System.out.println();
//
//        mainController.processClient();
//        System.out.println();

        mainController.showPizzaMenu();

        mainController.processClientOrder();
        mainController.processClientOrder();
        mainController.processClientOrder();
    }
}