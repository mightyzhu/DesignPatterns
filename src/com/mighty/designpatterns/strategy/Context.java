package com.mighty.designpatterns.strategy;

/**
 * @author mighty
 * @create 2019-04-08 14:57
 */
public class Context {

    Strategy strategy;

    /**
     * 构造方法传入具体策略对象
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 调用具体的策略算法
     * @return
     */
    public Object contextInterface(){
        return strategy.algorithmInterfate();
    }

}
