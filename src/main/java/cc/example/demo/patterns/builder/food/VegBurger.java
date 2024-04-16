package cc.example.demo.patterns.builder.food;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veggie Bugger";
    }

    @Override
    public float price() {
        return 25f;
    }
}
