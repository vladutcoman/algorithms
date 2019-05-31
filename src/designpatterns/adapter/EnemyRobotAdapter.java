package designpatterns.adapter;

public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot enemyRobot;

    EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }

    @Override
    public void fireWeapon() {
        this.enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        this.enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String driver) {
        this.enemyRobot.reactToHuman(driver);
    }
}
