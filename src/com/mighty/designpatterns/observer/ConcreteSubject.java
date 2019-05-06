package com.mighty.designpatterns.observer;

/**
 * @author mighty
 * @create 2019-04-23 16:42
 */
public class ConcreteSubject extends Subject {

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList
             ) {
            observer.update();
        }
    }
}
