public enum PizzaType {
    CAPRICIOSA("Capriciosa"),
    MARGHERITA("Margherita"),
    CALZONE("Calzone");

    String name;
    private PizzaType (String name) {
        this.name = name;
    }
}
