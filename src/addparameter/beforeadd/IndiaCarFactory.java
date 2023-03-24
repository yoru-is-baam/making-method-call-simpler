package addparameter.beforeadd;

import java.util.NoSuchElementException;

public class IndiaCarFactory {
    private IndiaCarFactory() {

    }

    public static Car buildCar(CarType model) {
        Car car;

        switch (model) {
            case MICRO -> car = new MicroCar(Location.INDIA);
            case MINI -> car = new MiniCar(Location.INDIA);
            case LUXURY -> car = new LuxuryCar(Location.INDIA);
            default -> throw new NoSuchElementException("Don't have this model");
        }

        return car;
    }
}
