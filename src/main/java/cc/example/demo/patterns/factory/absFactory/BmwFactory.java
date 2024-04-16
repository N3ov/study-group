package cc.example.demo.patterns.factory.absFactory;

import cc.example.demo.patterns.factory.Bmw;
import cc.example.demo.patterns.factory.Car;

public class BmwFactory implements AbsCarFactory{
    @Override
    public Car create() {
        return new Bmw();
    }
}
