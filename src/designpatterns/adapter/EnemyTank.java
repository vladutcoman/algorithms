package designpatterns.adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

    Random random = new Random();

    @Override
    public void fireWeapon() {
        System.out.println("Tank attack: " + random.nextInt(10));
    }

    @Override
    public void driveForward() {
        System.out.println("Tank drive forward: " + random.nextInt(1));
    }

    @Override
    public void assignDriver(String driver) {
        System.out.println("Tank driver: " + driver);
    }
}
