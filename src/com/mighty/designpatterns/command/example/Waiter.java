package com.mighty.designpatterns.command.example;

import com.mighty.designpatterns.command.Cammand;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 服务员
 *
 * @author mighty
 * @create 2019-05-13 16:15
 */
public class Waiter {

    private List<BarbecueCommand> orders = new ArrayList<BarbecueCommand>();


    /**
     * 增加订单
     * @param cammand 订单
     */
    public void addOrder(BarbecueCommand cammand) {
        if (cammand instanceof BakeChickenWingCammand) {
            System.out.println("服务员：鸡翅没有了，请点别的烧烤。");
        } else {
            orders.add(cammand);
            System.out.println("增加订单：" + cammand.toString() + "时间：" + new Date());
        }
    }

    /**
     * 取消订单
     * @param cammand 订单
     */
    public void cancelOrder(Cammand cammand) {
        orders.remove(cammand);
        System.out.println("取消订单"+ cammand.toString() + "时间：" + new Date());

    }

    public void makeCammand(){
        for (BarbecueCommand cammand: orders
             ) {
            cammand.executeCammand();
        }
    }

}
