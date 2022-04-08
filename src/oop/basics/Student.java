package oop.basics;

public class Student {
    String name;
    int rollNumber;
    Batch batch;
    double psp;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", batch=" + batch +
                ", psp=" + psp +
                '}';
    }

    void attendClass() {
        System.out.println(
                name + " is attending class."
        );
    }


    void chooseMentor(String mentorName) {
        System.out.println(
                name + "'s mentor is " + mentorName
        );
    }

    public static void main(String[] args) {
        Student student = new Student();
    }
}

// How to solve LLD Problems
// 2 ways to identify entities:
// - Visualization
// - Nouns

// Class.staticMethod();
