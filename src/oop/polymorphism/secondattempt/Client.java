package oop.polymorphism.secondattempt;

public class Client {

    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        Animal a2 = new Dog();

        // Dog d2 = new Animal();
        // COMPILE TIME ERROR
        // BECAUSE COMPILER CAN'T BE SURE IF
        // ANIMAL IS A DOG

//        Animal a3 = new Dog();
//        Dog d3 = a3;
        // COMPILE TIME ERROR BECAUSE
        // COMPILER IS ONLY GOING TO SEE
        // THE DATA TYPES OF BOTH SIDES

        Animal a4 = new Dog();
        Dog d4 = (Dog) a4;

//        Animal a5 = new Monkey();
//        Dog d5 = (Dog) a5;
        // RUN TIME ERROR at 26
        // because a5 in the heap is not
        // a dog.

//        Animal a6 = new Dog();
//        a6.breed = "Lab";
        // COMPILE TIME ERROR
        // Because for compiler a6 is a animal
        // and ANimal doesn't have attribute
        // breed

        Animal a7 = new Dog();
        a7.age = 18;
        a7.eat();

    }
}
