package com.mighty.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mighty
 * @create 2019-05-07 11:43
 */
public class Memento {

    private int money;
    private ArrayList<String> fruits;

    public int getMoney() {
        return money;
    }

    public Memento(int money) {
        this.money = money;
        fruits = new ArrayList<String>();
    }

    List<String> getFruits(){
        return (List<String>) fruits.clone();
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }

}
