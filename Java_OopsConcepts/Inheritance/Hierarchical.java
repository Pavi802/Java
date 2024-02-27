class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
class Cow extends Animal {
    void moo() {
        System.out.println("Cow is mooing");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        dog.eat();  // Accessing eat() method from Animal class
        dog.bark(); // Accessing bark() method from Dog class
        cat.eat();  // Accessing eat() method from Animal class
        cat.meow(); // Accessing meow() method from Cat class
        cow.eat();  // Accessing eat() method from Animal class
        cow.moo();  // Accessing moo() method from Cow class
    }
}
