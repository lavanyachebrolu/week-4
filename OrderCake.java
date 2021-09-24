public class OrderCake {
    private Cake cake;
    private String type;

    public OrderCake(String type) {
        this.cake = null;
        this.type = type;
        order();
    }

    public void order() {
        if (type.toLowerCase().contains("chocolate")) {
            cake = new ChocolateCake();
        } else if (type.toLowerCase().contains("vanilla")) {
            cake = new VanillaCake();
        }

        PrepareCake prepareCake = new PrepareCake(cake);
    }

    public Cake getCake() {
        return cake;
    }
}
