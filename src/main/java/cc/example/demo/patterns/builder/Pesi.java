package cc.example.demo.patterns.builder;

import java.math.BigDecimal;

public class Pesi extends Beverage{
    @Override
    public String name() {
        return "Pesi";
    }

    @Override
    public float price() {
        return 15f;
    }
}
