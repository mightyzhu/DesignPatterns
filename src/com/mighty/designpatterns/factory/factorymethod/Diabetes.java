package com.mighty.designpatterns.factory.factorymethod;

/**
 * @author mighty
 * @create 2019-04-11 16:41
 */
public class Diabetes extends ChronicDisease{

    public Diabetes(String name) {
        super(name);
    }

    public void doSomething(){
        System.out.println("Diabetes processing");
    }

    @Override
    public boolean verify(Integer data) {

        if(data > 10){
            return true;
        }

        return false;
    }
}
