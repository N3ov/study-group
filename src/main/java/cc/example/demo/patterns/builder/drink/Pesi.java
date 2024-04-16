package cc.example.demo.patterns.builder.drink;

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
