package com.mighty.designpatterns.decorator;

/**
 * @author mighty
 * @create 2019-04-09 16:08
 */
public abstract class Condiment extends Pancake {

    protected Pancake pancake;

    public abstract String getDesc();

}
