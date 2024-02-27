class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        animal.makeSound(); // Output: Some sound
        dog.makeSound();    // Output: Woof
        cat.makeSound();    // Output: Meow
    }
}
