package com.mighty.designpatterns.state;

/**
 * @author mighty
 * @create 2019-05-06 9:42
 */
public class ForenoonState extends WorkState {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间：" + work.getHour() + "点。上午工作，精神百倍");

        } else {
            work.setCurrentState(new NoonState());
            work.writeProgram();
        }
    }




}
