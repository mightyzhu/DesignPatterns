package com.mighty.designpatterns.decorator;

/**
 * @author mighty
 * @create 2019-04-09 16:00
 */
public class TornCake extends Pancake {
    public TornCake() {
        desc = "手抓饼";
    }

    @Override
    public double price() {
        return 0;
    }
}
