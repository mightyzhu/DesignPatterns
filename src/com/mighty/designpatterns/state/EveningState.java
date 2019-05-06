package com.mighty.designpatterns.state;

/**
 * @author mighty
 * @create 2019-05-06 9:42
 */
public class EveningState extends WorkState {

    @Override
    public void writeProgram(Work work) {
        if(work.isFinish()){
            work.setCurrentState(new RestState());
            work.writeProgram();
        }else{
            if (work.getHour() < 21) {
                System.out.println("当前时间：" + work.getHour() + "点。加班ing，疲惫至极");
            } else {
                work.setCurrentState(new SleepingState());
                work.writeProgram();   // 重点
            }
        }

    }

}
