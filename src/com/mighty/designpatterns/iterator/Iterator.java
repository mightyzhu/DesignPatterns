package com.mighty.designpatterns.iterator;

/**
 * @author mighty
 * @create 2019-05-09 16:48
 */
public abstract class Iterator {

    public abstract Object first();

    public abstract Object next();

    public abstract boolean isDone();

    public abstract Object currentItem();


}
