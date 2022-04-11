package oop.polymorphism.whenerror;

public class B extends A {
    int a;
    int b;
    int c;
    void bark() {}

    @Override
    void doSomething() {
        System.out.println("I AM B");
    }
}
