package com.mighty.designpatterns.observer;

/**
 * @author mighty
 * @create 2019-04-23 16:46
 */
public class ConcreteObserver1 implements Observer {

    @Override
    public void update() {
        System.out.println("ConcreteObserver1 作出对应处理。。。");
    }
}
