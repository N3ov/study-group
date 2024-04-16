package cc.example.demo.patterns.builder.food;

import cc.example.demo.patterns.builder.Item;
import cc.example.demo.patterns.builder.pack.Packing;
import cc.example.demo.patterns.builder.pack.Wrapper;

public abstract class Burger implements Item {
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
