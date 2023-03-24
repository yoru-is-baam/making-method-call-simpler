package addparameter.beforeadd;

import java.util.NoSuchElementException;

public class DefaultCarFactory {
    private DefaultCarFactory() {

    }

    public static Car buildCar(CarType model) {
        Car car;

        switch (model) {
            case MICRO -> car = new MicroCar(Location.DEFAULT);
            case MINI -> car = new MiniCar(Location.DEFAULT);
            case LUXURY -> car = new LuxuryCar(Location.DEFAULT);
            default -> throw new NoSuchElementException("Don't have this model");
        }

        return car;
    }
}
