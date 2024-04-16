package cc.example.demo.patterns.factory.simpleFactory;

import cc.example.demo.patterns.factory.Car;
import cc.example.demo.patterns.factory.CarBrandEnum;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = CarFactory.createCar(CarBrandEnum.BMW);
        car1.drive();

        System.out.println("--------------");

        Car car2 = CarFactory.createCar(CarBrandEnum.BENZ);
        car2.drive();
    }
}
