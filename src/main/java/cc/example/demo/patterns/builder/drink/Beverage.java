package cc.example.demo.patterns.builder.drink;

import cc.example.demo.patterns.builder.pack.Bottle;
import cc.example.demo.patterns.builder.Item;
import cc.example.demo.patterns.builder.pack.Packing;

public abstract class Beverage implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
