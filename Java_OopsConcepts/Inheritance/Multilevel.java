class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}
class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is black...");
    }
}
public class Main {
    public static void main(String[] args) {
        Labrador labrador = new Labrador();
        labrador.eat(); 
        labrador.bark(); 
        labrador.color(); 
    }
}
