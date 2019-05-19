package com.mighty.designpatterns.bridge;

/**
 * @author mighty
 * @create 2019-05-12 16:01
 */
public class MessageEmail implements MessageImplementer {
    @Override
    public void send(String message, String toUser) {
        System.out.println(String.format("使用邮件短消息的方法，发送消息 %s 给 %s", message, toUser));
    }
}
