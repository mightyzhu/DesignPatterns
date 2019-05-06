package com.mighty.designpatterns.decorator;

/**
 * @author mighty
 * @create 2019-04-09 16:11
 */
public class FiredEgg extends Condiment {

    public FiredEgg(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + ", 煎蛋";
    }

    @Override
    public double price() {
        return pancake.price() + 2;
    }
}
