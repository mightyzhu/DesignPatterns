package com.mighty.designpatterns.decorator;

/**
 * @author mighty
 * @create 2019-04-09 16:07
 */
public class Roujiamo extends Pancake {

    public Roujiamo() {
        desc = "肉夹馍";
    }

    @Override
    public double price() {
        return 6;
    }
}
