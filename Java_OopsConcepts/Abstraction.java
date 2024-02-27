abstract class Shape {
    public abstract void draw();
}
class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        rectangle.draw();
        circle.draw();
    }
}
