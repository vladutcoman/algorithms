package designpatterns.adapter;

public class TestEnemyAttackers {

    public static void main(String[] args) {

        EnemyTank tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);

        System.out.println("Robot: ");
        robot.reactToHuman("Vladut");
        robot.walkForward();
        robot.smashWithHands();

        System.out.println("Tank: ");
        tank.assignDriver("Vladut2");
        tank.driveForward();
        tank.fireWeapon();

        System.out.println("Robot adapter");
        robotAdapter.assignDriver("Vladut3");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
