package cc.example.demo.patterns.builder;

import cc.example.demo.patterns.builder.drink.Coke;
import cc.example.demo.patterns.builder.drink.Pesi;
import cc.example.demo.patterns.builder.food.ChickenBugger;
import cc.example.demo.patterns.builder.food.VegBurger;

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
