package com.mighty.designpatterns.prototype;

/**
 * @author mighty
 * @create 2019-04-13 16:05
 */
public class PrototypeObject implements Cloneable {

    private String name;

    private int i;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public PrototypeObject clone() throws CloneNotSupportedException {
        return (PrototypeObject)super.clone();
    }
}
