package oop.polymorphism.last;

import java.util.List;

public class Client {

    // walkAllDogs(List<Dog)
    // walkAll Cat(List<Cat)


    private static void walkAllAnimals(List<Animal> animals) {
        for (Animal animal: animals) {
            animal.walk();
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Horse h = new Horse();
        Labrador l = new Labrador();
        Monkey m = new Monkey();
        ShihTzu s = new ShihTzu();

        List<Animal> animals = List.of(
                a, d, h, l, m, s
        );

        walkAllAnimals(animals);
    }
}
