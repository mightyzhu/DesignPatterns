package com.mighty.designpatterns.factory.factorymethod;

/**
 * @author mighty
 * @create 2019-04-11 16:12
 */
public abstract class ChronicDisease {

    private String name;

    public ChronicDisease(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean verify(Integer data);
}
