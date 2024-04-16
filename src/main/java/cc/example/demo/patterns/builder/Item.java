package cc.example.demo.patterns.builder;

import java.math.BigDecimal;

public interface Item {

    public String name();
    public Packing packing();
    public float price();
}
