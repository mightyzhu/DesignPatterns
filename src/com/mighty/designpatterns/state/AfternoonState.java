package com.mighty.designpatterns.state;

/**
 * @author mighty
 * @create 2019-05-06 9:42
 */
public class AfternoonState extends WorkState {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间：" + work.getHour() + "点。上下午状态还不错，继续努力");
        } else {
            work.setCurrentState(new EveningState());
            work.writeProgram();
        }
    }

}
