package com.mighty.designpatterns.visitor;

/**
 * @author mighty
 * @create 2019-05-19 14:56
 */
public abstract class Visitor {

    public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);

    public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
