public class PrepareBase{
    private Cake cake;

    public PrepareBase(Cake cake) {
        this.cake = cake;
        prepare();
    }

    public void prepare() {
        System.out.println("Preparing base");
        Base cakeBase = new Base("Sponge base");
        cake.setBase(cakeBase);
    }
}
