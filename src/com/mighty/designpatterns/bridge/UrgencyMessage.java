package com.mighty.designpatterns.bridge;

/**
 * @author mighty
 * @create 2019-05-12 15:33
 */
public class UrgencyMessage extends AbstractMessage{

    /**
     * 构造方法，传入实现部分的对象
     *
     * @param implementer 实现部分的对象
     */
    public UrgencyMessage(MessageImplementer implementer) {
        super(implementer);
    }

    @Override
    public void sendMessage(String msg, String toUser) {
        super.sendMessage(msg, toUser);
    }

    /**
     * 扩展它自己的功能，监控某个消息的处理状态
     * @param messageId 消息编码
     * @return 监控到的消息的处理状态
     */
    public Object watch(String messageId) {
        //根据给出的消息编码查询消息的处理状态，组织成监控的处理状态，然后返回。
        return null;
    }
}
