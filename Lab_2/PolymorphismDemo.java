/*Assignment 2.3: Polymorphism using Method Overriding

Objective: Demonstrate runtime polymorphism
Task:
Create a base class Animal with method sound().
Override this method in derived classes Dog and Cat. Call the method using a superclass reference.

*/
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Superclass reference, subclass object
        Animal a;

        a = new Dog(); // Dog object
        a.sound(); // calls Dog's overridden method

        a = new Cat(); // Cat object
        a.sound(); // calls Cat's overridden method
    }
}
/*
 * Output:-
 * Dog barks
 * Cat meows
 */