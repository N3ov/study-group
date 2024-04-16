package cc.example.demo.patterns.builder;

import java.math.BigDecimal;

public abstract class Beverage implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
