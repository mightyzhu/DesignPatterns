package com.mighty.designpatterns.builder;

/**
 * @author mighty
 * @create 2019-04-17 14:53
 */
public abstract class RobotBuilder {

     abstract void assembleHead();

     abstract void assembleBody();

     abstract void assembleArms();

     abstract void assembleLegs();

     abstract Robot createRobot();

}
