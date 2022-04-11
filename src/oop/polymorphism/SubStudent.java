package oop.polymorphism;

public class SubStudent extends Student {

    // attendClass(String)
    int attendClass(String d) {
        System.out.println("Hello");
        return 0;
    }
}

// How compiler works

// OVERRIDING
// If a compiler sees 2 methods with same signature in parent-child: =>
// class A {
//   doSomething(int, String) {}
// }
//
// class B extends A {
//   doSomething(int, String) {}
//
// }
// Signature: return_type func_name(typeA, typeB, ....)

// If a compiler sees 2 methods with same signature in same class:
// COMPILE TIME ERROR

// If a compiler sees 2 methods with exactly same erasure but not exactly same signature
// Same or parent-child class
// attendClass(int)
// int attendClass(int)
// String attendClass(int)
// COMPILE TIME ERROR
// class A {
//    int attendClass(int)
// }
// class B extend A {
//   String attendClass(int)
// }

// If a compiler sees 2 methods with same name but different erasure
// attendClass(int)
// attendClass(String)
// OVERLOADING