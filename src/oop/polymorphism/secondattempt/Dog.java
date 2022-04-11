package oop.polymorphism.secondattempt;

public class Dog extends Animal {
    String breed;

    void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    void eat() {

        System.out.println("Dog is munching");
        super.eat();
    }
}
