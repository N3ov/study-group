package cc.example.demo.patterns.builder;

import cc.example.demo.patterns.builder.pack.Packing;

public interface Item {

    public String name();
    public Packing packing();
    public float price();
}
