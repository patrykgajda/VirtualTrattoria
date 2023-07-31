import java.sql.SQLOutput;

public class VirtualTrattoria {

    public static void main(String[] args) {

        UserName firstUser = new UserName("Andrzej");

        myOrder();

        Pizza pizza1 = new Capriciosa();
        pizza1.pizza();

    }

    private static void myOrder() {
        System.out.println("What pizza would you like to eat?");

    }


}
