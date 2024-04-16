package cc.example.demo.patterns.factory.absFactory;

import cc.example.demo.patterns.factory.Car;
import cc.example.demo.patterns.factory.simpleFactory.CarFactory;

public class AbsFactoryDemo {
    public static void main(String[] args) {
        AbsCarFactory bmwFac = new BmwFactory();
        Car bmw = bmwFac.create();
        bmw.drive();

        System.out.println("----------------------");

        AbsCarFactory benzFac = new BenzFactory();
        Car benz = benzFac.create();
        benz.drive();

    }
}
