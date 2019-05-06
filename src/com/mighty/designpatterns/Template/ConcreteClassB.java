package com.mighty.designpatterns.Template;

/**
 * @author mighty
 * @create 2019-04-14 21:45
 */
public class ConcreteClassB extends AbstractTemplate {
    @Override
    public void primitiveOperationA() {
        System.out.println("实例B中的A处理");
    }

    @Override
    public void primitiveOperationB() {
        System.out.println("实例B中的B处理");
    }
}
