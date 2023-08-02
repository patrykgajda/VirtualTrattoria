public enum PizzaType {
    CAPRICIOSA("capriciosa"),
    MARGHERITA("margherita"),
    CALZONE("calzone");

    String name;
    private PizzaType (String name) {
        this.name = name;
    }
}
