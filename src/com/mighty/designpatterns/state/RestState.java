package com.mighty.designpatterns.state;

/**
 * @author mighty
 * @create 2019-05-06 9:42
 */
public class RestState extends WorkState {

    @Override
    public void writeProgram(Work work) {
            System.out.println("当前时间：" + work.getHour() + "点。下班回家了");

    }
}
