public class PrepareCake{
    private Cake cake;

    public PrepareCake(Cake cake) {
        this.cake = cake;
        prepareCake();
    }

    public void prepareCake() {
        System.out.println("Preparing " + cake.getName());
        PrepareBase prepareBase = new PrepareBase(cake);
        AddTopping addTopping = new AddTopping(cake);
    }
}
