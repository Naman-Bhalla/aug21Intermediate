package designpatterns.structural.flyweight.after;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {

    Map<BulletType, Bullet> bullets = new HashMap<>();

    void register(BulletType type,
                  Bullet bullet) {
        if (bullets.containsKey(type)) {
            throw new IllegalArgumentException();
        }

        bullets.put(type, bullet);
    }

    Bullet get(BulletType type) {
        if (bullets.containsKey(type)) {
            return bullets.get(type);
        }

        throw new IllegalArgumentException();
    }

}

// Human -> name, age, gender
// RunningPerson -> curCoord, curSpeed, curRank