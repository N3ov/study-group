package cc.example.demo.patterns.prototype;

public class Circle implements Shape {

    private int radius;
    public Circle(int r) {
        this.radius = r;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }

    @Override
    public Shape clone() {
        return new Circle(radius);
    }
}
