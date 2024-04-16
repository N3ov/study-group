package cc.example.demo.patterns.builder;

import java.math.BigDecimal;

public abstract class Burger implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
