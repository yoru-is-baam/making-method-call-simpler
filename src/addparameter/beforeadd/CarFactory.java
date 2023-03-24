package addparameter.beforeadd;

public class CarFactory {
    private CarFactory() {

    }

    public static Car buildCar(CarType type, Location location) {
        Car car;

        switch (location) {
            case USA:
                car = UsaCarFactory.buildCar(type);
                break;
            case INDIA:
                car = IndiaCarFactory.buildCar(type);
                break;
            default:
                car = DefaultCarFactory.buildCar(type);
        }

        return car;
    }
}
