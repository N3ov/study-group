package cc.example.demo.patterns.builder;

import java.math.BigDecimal;

public class Coke extends Beverage{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 20f;
    }
}
