package com.mighty.designpatterns.instance;

/**
 * @author mighty
 * @create 2019-05-10 16:26
 */
public class HungrySingleton {

    private static class SingletonHolder {
        private static final HungrySingleton INSTANCE = new HungrySingleton();
    }

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
