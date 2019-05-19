package com.mighty.designpatterns.bridge;

/**
 * @author mighty
 * @create 2019-05-12 15:24
 */
public interface MessageImplementer {

    /**
     * 发送消息方法
     * @param message 要发送消息的内容
     * @param toUser 接收人
     */
    void send(String message, String toUser);
}
