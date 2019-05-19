package com.mighty.designpatterns.command;

/**
 * @author mighty
 * @create 2019-05-13 16:03
 */
public class Invoker {

    private Cammand cammand;

    public void setCammand(Cammand cammand) {
        this.cammand = cammand;
    }

    public void executeCammand(){
        System.out.println("中间调用者调用Cammand的执行方法");
        cammand.execute();
    }
}
