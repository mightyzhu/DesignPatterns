package com.mighty.designpatterns.visitor;

/**
 * @author mighty
 * @create 2019-05-19 14:59
 */
public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElementB(this);
    }

    public void operation() {
        System.out.println("其他方法");
    }

}
