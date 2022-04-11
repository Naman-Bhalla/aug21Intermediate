package oop.polymorphism.last;

public class Animal {
    public String name;
    private int numberOfLegs;
    protected int weight;

    public void walk() {
        System.out.println("Animal is walking");
    }
    private void eat() {}
    protected void talk() {}
}
