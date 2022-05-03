package designpatterns.structural.flyweight.before;

import oop.polymorphism.whenerror.A;
import oop.polymorphism.whenerror.B;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Bullet> bullets = new ArrayList<>();

        for (int i = 0; i < 10000; ++i) {
            Bullet b = new Bullet();
            b.image = new byte[]{0, 0, 0};
            bullets.add(b);
        }
    }
}
