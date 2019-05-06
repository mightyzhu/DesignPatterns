package com.mighty.designpatterns.decorator;

/**
 * @author mighty
 * @create 2019-04-09 16:24
 */
public class MeatFloss extends Condiment {

    public MeatFloss(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + "， 肉松";
    }

    @Override
    public double price() {
        return pancake.price() + 1;
    }
}
