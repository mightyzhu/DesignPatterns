package com.mighty.designpatterns.factory.factorymethod;

/**
 * @author mighty
 * @create 2019-04-11 16:36
 */
public class Hypertension extends ChronicDisease{

    public Hypertension(String name) {
        super(name);
    }

    @Override
    public boolean verify(Integer data) {

        if(data > 80){
            return true;
        }
        return false;
    }
}
