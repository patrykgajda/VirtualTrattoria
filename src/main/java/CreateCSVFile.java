import java.io.*;
import java.util.ArrayList;
//import java.util.Arrays;

public class CreateCSVFile {

//    private static String[] columns = {"ClientNo", "ClientName", "PizzaName", "PizzaIngredients"};
    public static void createNewCSVFile(String filePath, Clients client, ArrayList<Pizza> pizzaArrayList) throws FileNotFoundException {

        File csvFile = new File("saveDataToCSVFile.csv");
        PrintWriter writer = new PrintWriter(csvFile);
//        writer.println(Arrays.toString(columns));
        for (Pizza pizza : pizzaArrayList) {
            writer.print(client.getClientNo() + " ");
            writer.print(client.getName() + " ");
            writer.print(pizza.getPizzaName() + " ");
            writer.print(pizza.getPizzaIngredients());
            writer.println();
        }
        writer.close();
    }
}