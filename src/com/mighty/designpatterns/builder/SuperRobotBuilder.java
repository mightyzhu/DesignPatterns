package com.mighty.designpatterns.builder;

/**
 * @author mighty
 * @create 2019-04-19 14:40
 */
public class SuperRobotBuilder extends RobotBuilder{

        private Robot robot = new Robot();

        @Override
        public void assembleHead() {
            robot.setRobotHead(new RobotHead("超合金","椭圆"));
        }

        @Override
        public void assembleBody() {
            robot.setRobotBody(new RobotBody("超合金","方形"));
        }

        @Override
        public void assembleArms() {
            robot.setRobotArms(new RobotArms("超合金","臂爪"));
        }

        @Override
        public void assembleLegs() {
            robot.setRobotLegs(new RobotLegs("超合金","弹簧腿"));
        }


    public Robot createRobot(){
        return robot;
    }
}
