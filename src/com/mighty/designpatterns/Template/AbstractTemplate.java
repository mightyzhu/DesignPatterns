package com.mighty.designpatterns.Template;

/**
 * @author mighty
 * @create 2019-04-14 21:39
 */
public abstract class AbstractTemplate {

    public abstract void primitiveOperationA();
    public abstract void primitiveOperationB();

    public void templateMethod() {
        System.out.println("模板方法1 处理。。。。。。。。。。");
        primitiveOperationA();
        System.out.println("模板方法2 处理。。。。。。。。。。");
        primitiveOperationB();
    }
}
