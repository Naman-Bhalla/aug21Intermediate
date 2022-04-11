package oop.polymorphism;

public class Student {

    // attendClass()
    void attendClass() {
        System.out.println("Student is attending" +
                "class");
    }

    // attendClass(int)
    int attendClass(int a) {
        System.out.println("INT Student is attending" +
                "class");
        return 0;
    }

    // attendClass(String)
    int attendClass(String a) {
        System.out.println("STRING");
        return 0;
    }


    public static void main(String[] args) {
        Student student = new Student();
    }
}

// method signature = method return type
//                    + method erasure

// You got scooter from father
// If you keep the same scooter (exact same method signature)
// but decorate it => Overriding
// If you buy a new scooter => Overloading