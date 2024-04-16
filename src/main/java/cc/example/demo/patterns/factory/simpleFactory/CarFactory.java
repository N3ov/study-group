package cc.example.demo.patterns.factory.simpleFactory;

import cc.example.demo.patterns.factory.Benz;
import cc.example.demo.patterns.factory.Bmw;
import cc.example.demo.patterns.factory.Car;
import cc.example.demo.patterns.factory.CarBrandEnum;

public class CarFactory {
    public static Car createCar(CarBrandEnum type) {
        if (CarBrandEnum.BENZ.equals(type)) {
            return new Benz();
        } else if (CarBrandEnum.BMW.equals(type)) {
            return new Bmw();
        }

        return null;
    }
}
