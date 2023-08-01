public abstract class Pizza implements Ingredients{

    public abstract void pizza();

    public void getOrder() {
        System.out.println("getorder");
    }
    public abstract void addBasicIngredient();
}
