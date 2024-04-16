package cc.example.demo.patterns.builder.food;

public class ChickenBugger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 60f;
    }
}
