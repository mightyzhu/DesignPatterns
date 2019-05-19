package com.mighty.designpatterns.bridge;

/**
 * @author mighty
 * @create 2019-05-12 15:31
 */
public class CommonMessage extends AbstractMessage {

    /**
     * 构造方法，传入实现部分的对象
     *
     * @param implementer 实现部分的对象
     */
    public CommonMessage(MessageImplementer implementer) {
        super(implementer);
    }

    @Override
    public void sendMessage(String msg, String toUser) {
        //对于普通消息，直接调用父类方法，发送消息即可
        super.sendMessage(msg, toUser);
    }
}
