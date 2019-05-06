package com.mighty.designpatterns.builder;

/**
 * @author mighty
 * @create 2019-04-19 14:40
 */
public class NoobRobotBuilder extends  RobotBuilder{

    private Robot robot = new Robot();

    @Override
    public void assembleHead() {
        robot.setRobotHead(new RobotHead("木头","椭圆"));
    }

    @Override
    public void assembleBody() {
        robot.setRobotBody(new RobotBody("木头","方形"));
    }

    @Override
    public void assembleArms() {
        robot.setRobotArms(new RobotArms("木头","一体臂"));
    }

    @Override
    public void assembleLegs() {
        robot.setRobotLegs(new RobotLegs("木头","椅子脚"));
    }


    public Robot createRobot(){
        return robot;
    }
}
