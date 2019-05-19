package pl.kk.fso;

import pl.kk.fso.car.Builder;
import pl.kk.fso.car.Car;

public class Fabryka {

    public static void main(String[] args) {
        Fabryka fabryka = new Fabryka();
        Car c = fabryka.kupSedana();
        System.out.println(c);
    }

    public Car kupSedana() {
        return new Builder().buildSedan();
    }
}
