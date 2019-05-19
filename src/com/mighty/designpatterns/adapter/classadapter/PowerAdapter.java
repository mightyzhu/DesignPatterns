package com.mighty.designpatterns.adapter.classadapter;

/**
 * @author mighty
 * @create 2019-05-07 9:42
 */
public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5V() {
        int output = output220V();
        return output / 44;
    }
}
