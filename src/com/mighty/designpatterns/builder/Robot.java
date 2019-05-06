package com.mighty.designpatterns.builder;

/**
 * @author mighty
 * @create 2019-04-19 11:21
 */
public class Robot {

    private RobotArms robotArms;

    private RobotBody robotBody;

    private RobotHead robotHead;

    private RobotLegs robotLegs;

    public RobotArms getRobotArms() {
        return robotArms;
    }

    public void setRobotArms(RobotArms robotArms) {
        this.robotArms = robotArms;
    }

    public RobotBody getRobotBody() {
        return robotBody;
    }

    public void setRobotBody(RobotBody robotBody) {
        this.robotBody = robotBody;
    }

    public RobotHead getRobotHead() {
        return robotHead;
    }

    public void setRobotHead(RobotHead robotHead) {
        this.robotHead = robotHead;
    }

    public RobotLegs getRobotLegs() {
        return robotLegs;
    }

    public void setRobotLegs(RobotLegs robotLegs) {
        this.robotLegs = robotLegs;
    }
}
