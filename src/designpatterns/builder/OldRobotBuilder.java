package designpatterns.builder;

public class OldRobotBuilder implements RobotBuilder {

    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("R1 head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("R1 torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("R1 arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("R1 legs");
    }

    @Override
    public Robot getRobot() {
         return this.robot;
    }
}
