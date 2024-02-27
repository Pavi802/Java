class Fruit {
    String name;
    String color;
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }
}
class Apple extends Fruit {
    String variety;
    public Apple(String name, String color, String variety) {
        super(name, color); 
        this.variety = variety;
    }
    @Override
    public void display() {
        super.display(); // calling display method of parent class
        System.out.println("Variety: " + variety);
    }
}
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple("Apple", "Red", "Red Delicious");
        apple.display();
    }
}
