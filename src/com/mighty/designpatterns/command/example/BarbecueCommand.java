package com.mighty.designpatterns.command.example;

/**
 * @author mighty
 * @create 2019-05-13 16:47
 */
public abstract class BarbecueCommand {

    protected Barbecuer reciever;

    public BarbecueCommand(Barbecuer reciever) {
        this.reciever = reciever;
    }

    abstract public void executeCammand();
}
