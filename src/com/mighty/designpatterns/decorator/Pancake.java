package com.mighty.designpatterns.decorator;

/**
 * @author mighty
 * @create 2019-04-09 15:21
 */
public abstract class Pancake  {

    public String desc = "我不是一个具体的煎饼";

    public String getDesc(){
        return desc;
    }

    public abstract double price();

}
