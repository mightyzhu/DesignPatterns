package com.mighty.designpatterns.mediator;

/**
 * @author mighty
 * @create 2019-05-14 15:54
 */
public class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }


    /**
     * 声明
     * @param msg 声明内容
     */
    public void declare(String msg) {
        mediator.delacre(msg, this);
    }

    /**
     * 获得消息
     * @param msg 声明内容
     */
    public void getMessage(String msg) {
        System.out.println("美国获得对方信息：" + msg);
    }
}
