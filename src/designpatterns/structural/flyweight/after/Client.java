package designpatterns.structural.flyweight.after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        List<FlyingBullet> flyingBullets = new ArrayList<>();
        BulletRegistry registry = new BulletRegistry();

        Bullet fiveMMBullet = new Bullet();
        fiveMMBullet.maxDamage = 300;
        fiveMMBullet.weight = 200;
        registry.register(BulletType.FIVE, fiveMMBullet);

        Bullet sevenMMBullet = new Bullet();
        sevenMMBullet.weight = 40;
        registry.register(BulletType.SEVEN, sevenMMBullet);

        for (int i = 0; i < 10000; ++i) {
            FlyingBullet flyingBullet = new FlyingBullet();
            String type = "5"; // take input from command line
            flyingBullet.bullet = registry.get(BulletType.FIVE);
            flyingBullets.add(flyingBullet);
        }

        System.out.println("Done");
    }
}

// Registryu == Singleton + Factory