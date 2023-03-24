package addparameter.afteradd;

public class MiniCar extends Car {
    public MiniCar(Location location) {
        super(CarType.MINI, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Connecting to Mini Car");
    }
}
