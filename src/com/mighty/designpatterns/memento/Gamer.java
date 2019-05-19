package com.mighty.designpatterns.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @author mighty
 * @create 2019-05-07 11:51
 */
public class Gamer {

    private static String[] FRUITS_NAME = {"香蕉", "苹果", "橘子", "柚子"};

    private int money;
    private List<String> fruits = new ArrayList<String>();
    private Random random = new Random();

    public int getMoney() {
        return money;
    }

    public Gamer(int money) {
        this.money = money;
    }

    public void bet() {

        int next = random.nextInt(6) + 1;

        if (next == 1) {
            money += 100;
            System.out.println("金钱增加了100，当前金钱为：" + money);
        } else if (next == 2) {
            money /= 2;
            System.out.println("金钱减少了一半，当前金钱为：" + money);

        } else if (next == 6) {
            String fruit = getFruit();
            fruits.add(fruit);
            System.out.println("获得了水果：" + fruit + "，当前金钱为：" + money);

        }

    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + FRUITS_NAME[random.nextInt(FRUITS_NAME.length)];
    }

    public Memento createMemento() {
        Memento m = new Memento(money);
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String fruit = it.next();
            if (fruit.startsWith("好吃的")) {
                m.addFruit(fruit);
            }
        }

        return m;
    }


    public void resotreMemento(Memento memento) {
        this.money = memento.getMoney();
        this.fruits = memento.getFruits();
    }


    public String toString() {
        return "Menoy：" + money + " ,Fruits:" + fruits;
    }
}
