package com.mighty.designpatterns.decorator;

/**
 * @author mighty
 * @create 2019-04-09 16:25
 */
public class Cucumber extends Condiment {

    public Cucumber(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc() + "， 黄瓜";
    }

    @Override
    public double price() {
        return pancake.price() + 0.5;
    }
}
