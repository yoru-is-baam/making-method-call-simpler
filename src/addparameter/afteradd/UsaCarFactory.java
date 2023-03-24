package addparameter.afteradd;

import java.util.NoSuchElementException;

public class UsaCarFactory {
    private UsaCarFactory() {

    }

    public static Car buildCar(CarType model) {
        Car car;

        switch (model) {
            case MICRO -> car = new MicroCar(Location.USA);
            case MINI -> car = new MiniCar(Location.USA);
            case LUXURY -> car = new LuxuryCar(Location.USA);
            default -> throw new NoSuchElementException("Don't have this model");
        }

        return car;
    }
}
