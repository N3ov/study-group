package cc.example.demo.patterns.builder.drink;

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
