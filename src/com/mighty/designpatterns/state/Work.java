package com.mighty.designpatterns.state;

/**
 * @author mighty
 * @create 2019-05-06 9:37
 */
public class Work {

    private WorkState currentState;

    private double hour;

    private boolean finish = false;

    public Work() {
        currentState = new ForenoonState();

    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setCurrentState(WorkState currentState) {
        this.currentState = currentState;
    }

    public void writeProgram(){
        currentState.writeProgram(this);
    }
}
