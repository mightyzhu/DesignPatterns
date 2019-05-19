package com.mighty.designpatterns.visitor;

/**
 * @author mighty
 * @create 2019-05-19 15:13
 */
public class ConcreteVisitor2 extends Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA concreteElementA) {
        System.out.println(String.format("%s被%s访问", concreteElementA.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB concreteElementB) {
        System.out.println(String.format("%s被%s访问", concreteElementB.getClass().getSimpleName(), this.getClass().getSimpleName()));
    }
}
