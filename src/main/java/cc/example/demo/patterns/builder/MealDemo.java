package cc.example.demo.patterns.builder;

public class MealDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal vegMeal = builder.prepareVegMeal();
        System.out.println("prepare veggie meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        System.out.println("------------------------------------------");

        Meal chickenMeal = builder.prepareChickenMeal();
        System.out.println("prepare chicken meal");
        chickenMeal.showItems();
        System.out.println("Total Cost: " + chickenMeal.getCost());
    }
}
