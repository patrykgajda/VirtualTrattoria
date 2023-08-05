public enum PizzaType {
    CAPRICIOSA("capriciosa"),
    MARGHERITA("margherita"),
    CALZONE("calzone");

    final String name;
    private PizzaType (String name) {
        this.name = name;
    }
}
