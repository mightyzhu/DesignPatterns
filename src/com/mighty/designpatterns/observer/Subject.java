package com.mighty.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mighty
 * @create 2019-04-23 14:48
 */
public abstract class Subject {

    protected List<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    public void removeObserve(Observer observer){
        observerList.remove(observer);
    }
    public abstract void notifyObservers();


}
