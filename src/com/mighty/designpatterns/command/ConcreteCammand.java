package com.mighty.designpatterns.command;

/**
 * @author mighty
 * @create 2019-05-13 16:06
 */
public class ConcreteCammand extends Cammand {
    public ConcreteCammand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("命令实现类调用实际请求的方法");
        receiver.doAction();
    }
}
