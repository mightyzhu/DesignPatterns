package com.mighty.designpatterns.state;

/**
 * @author mighty
 * @create 2019-05-06 9:42
 */
public class NoonState extends WorkState {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间：" + work.getHour() + "点。吃午饭，午休");
        } else {
            work.setCurrentState(new AfternoonState());
            work.writeProgram();
        }
    }

}
