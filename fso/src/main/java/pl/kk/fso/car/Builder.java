package pl.kk.fso.car;

import pl.kk.fso.car.parts.CarType;
import pl.kk.fso.car.parts.Color;

public class Builder {

    public Car buildSedan() {
        Car c = new Car();
        c.setCarType(CarType.SEDAN);
        c.setColor(Color.RED);
        c.setSeats(2);
        return c;
    }
}
