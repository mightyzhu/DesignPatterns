package com.mighty.designpatterns.bridge;

/**
 * @author mighty
 * @create 2019-05-12 15:25
 */
public abstract class AbstractMessage {

    MessageImplementer implementer;

    public AbstractMessage(MessageImplementer implementer) {
        this.implementer = implementer;
    }

    /**
     * 发送消息，委派给实现部分的方法
     * @param msg 要发送的消息
     * @param toUser 接收人
     */
    public void sendMessage(String msg, String toUser) {
        this.implementer.send(msg, toUser);
    }

}
