package com.mighty.designpatterns.command.example;

/**
 * @author mighty
 * @create 2019-05-13 16:50
 */
public class BakeChickenWingCammand extends BarbecueCommand {
    public BakeChickenWingCammand(Barbecuer reciever) {
        super(reciever);
    }

    @Override
    public void executeCammand() {
        reciever.bakeChickenWing();
    }
}
