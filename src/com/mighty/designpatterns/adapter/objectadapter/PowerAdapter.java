package com.mighty.designpatterns.adapter.objectadapter;

import com.mighty.designpatterns.adapter.classadapter.AC220;
import com.mighty.designpatterns.adapter.classadapter.DC5;

/**
 * @author mighty
 * @create 2019-05-07 10:02
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220;

    @Override
    public int output5V() {
        return ac220.output220V() / 44;
    }
}
