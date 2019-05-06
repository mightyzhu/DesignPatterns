package com.mighty.designpatterns.strategy;

/**
 * @author mighty
 * @create 2019-04-08 14:41
 */
public class ConcreteStrategyA extends Strategy{
    /**
     * 子类实现具体的算法
     *
     * @return
     */
    @Override
    public Object algorithmInterfate() {
        // TODO
        System.out.println("实现算法A");
        return null;
    }
}
