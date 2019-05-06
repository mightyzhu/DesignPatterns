package com.mighty.designpatterns.builder;

/**
 * @author mighty
 * @create 2019-04-19 13:55
 */
public class RobotDirector {

private RobotBuilder robotBuilder;

    public RobotDirector(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot buildRobot(){
        robotBuilder.assembleArms();
        robotBuilder.assembleBody();
        robotBuilder.assembleHead();
        robotBuilder.assembleLegs();
        return robotBuilder.createRobot();

    }


}
