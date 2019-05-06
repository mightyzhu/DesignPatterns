package com.mighty.designpatterns.proxy;

/**
 * @author mighty
 * @create 2019-04-10 0:30
 */
public class Proxy extends Subject{
    private Subject realSubject;

    public Proxy(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        realSubject.request();
    }
}
