package oop.basics;

public class Client {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.name = "Alok";
        System.out.println(student);
        student.psp = 88;
        System.out.println(student);

        Student bestStudent = new Student();
        System.out.println(bestStudent);
        bestStudent.name = "Abhishek";
        System.out.println(bestStudent);
        bestStudent.psp = 76;
        System.out.println(bestStudent);



    }
}
