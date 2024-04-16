package cc.example.demo.patterns.factory.absFactory;

import cc.example.demo.patterns.factory.Benz;
import cc.example.demo.patterns.factory.Car;

public class BenzFactory implements AbsCarFactory{
    @Override
    public Car create() {
        return new Benz();
    }
}
