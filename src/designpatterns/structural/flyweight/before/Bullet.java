package designpatterns.structural.flyweight.before;

import designpatterns.structural.flyweight.after.BulletType;

public class Bullet {

    BulletType type;
    int maxDamage;
    byte[] image;
    double weight;
    double curSpeed;
    double curPosX;
    double curPosY;
    double curPosZ;
    double curDirection;
    boolean isFired;
}
