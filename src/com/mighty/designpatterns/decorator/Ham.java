package com.mighty.designpatterns.decorator;

/**
 * @author mighty
 * @create 2019-04-09 16:22
 */
public class Ham extends Condiment {

    public Ham(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + "， 火腿片";
    }

    @Override
    public double price() {
        return pancake.price() + 1.5;
    }
}
