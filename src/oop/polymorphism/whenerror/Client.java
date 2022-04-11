package oop.polymorphism.whenerror;

public class Client {
    public static void main(String[] args) {
        // WORK
        A a = new B();
//        a.a = 20;
        a.f = 10;
        a.g = 20;
        a.doSomething();
        B b = (B) a;
        b.bark();

//       NOT WORK
//        A a = new A();
//        B b = (B) a;
//        b.bark()

        // Object: Parent Class
        // A: Child CLass
        Object o = new A();
    }
}
