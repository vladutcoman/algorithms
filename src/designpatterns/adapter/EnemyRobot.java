package designpatterns.adapter;

import java.util.Random;

public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands() {
        System.out.println("Robot smash with dmg " + generator.nextInt(10));
    }

    public void walkForward() {
        System.out.println("Robot walk " + generator.nextInt(10));
    }

    public void reactToHuman(String driver) {
        System.out.println("Robot react to human " + driver);
    }
}
