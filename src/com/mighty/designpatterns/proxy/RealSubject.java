package com.mighty.designpatterns.proxy;

/**
 * @author mighty
 * @create 2019-04-10 0:13
 */
public class RealSubject extends Subject{

    @Override
    public void request() {
        System.out.println("被代理者的处理");
    }
}
