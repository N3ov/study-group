package cc.example.demo.patterns.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape circle = new Circle(8);

        Shape rectangle1 = rectangle.clone();
        Shape circle1 = circle.clone();

        System.out.println(rectangle1 == rectangle);
        System.out.println(circle1 == circle);
    }
}
