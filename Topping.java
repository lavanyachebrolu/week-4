public abstract class Topping {
    private String name;

    public Topping(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
