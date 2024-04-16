package cc.example.demo.patterns.builder;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pesi());
        return meal;
    }

    public Meal prepareChickenMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBugger());
        meal.addItem(new Coke());
        return meal;
    }
}
