package com.mighty.designpatterns.command;

/**
 * @author mighty
 * @create 2019-05-13 15:52
 */
public abstract class Cammand {

    protected Receiver receiver;

    public Cammand(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract public void execute();
}
