package com.mighty.designpatterns.command.example;

/**
 * @author mighty
 * @create 2019-05-13 16:50
 */
public class BakeMuttonCammand extends BarbecueCommand {
    public BakeMuttonCammand(Barbecuer reciever) {
        super(reciever);
    }

    @Override
    public void executeCammand() {
        reciever.bakeMutton();
    }
}
