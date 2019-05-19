package com.mighty.designpatterns.adapter.interfaceadapter;

import com.mighty.designpatterns.adapter.classadapter.AC220;

/**
 * @author mighty
 * @create 2019-05-07 10:36
 */
public abstract class PowerAdapter implements DCOutput{
    protected AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        return ac220.output220V();
    }

    @Override
    public int output9V() {
        return ac220.output220V();
    }

    @Override
    public int output12V() {
        return ac220.output220V();
    }

    @Override
    public int output24V() {
        return ac220.output220V();
    }
}
