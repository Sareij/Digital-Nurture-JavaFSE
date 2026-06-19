/**
 * Exercise 18 - Animal Inheritance Demo
 * Objective:
 * Demonstrate inheritance and method overriding.
 */

class Animal {

    void makeSound() {

        System.out.println("Animal makes a sound");

    }
}

class Dog extends Animal {

    @Override
    void makeSound() {

        System.out.println("Bark");

    }
}

public class Exercise18_AnimalInheritanceDemo {

    public static void main(String[] args) {

        Animal animal = new Animal();

        Dog dog = new Dog();

        System.out.println("Animal Sound:");
        animal.makeSound();

        System.out.println("Dog Sound:");
        dog.makeSound();

    }
}