package com.mighty.designpatterns.handler;

/**
 * 总监
 *
 * @author mighty
 * @create 2019-05-13 22:27
 */
public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(WorkRequest request) {
        if ("请假".equals(request.getRequestType())) {
            System.out.println(String.format("%s:%s 数量%d 被批准", name, request.getRequestContent(), request.getNumber()));
        } else if("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
            System.out.println(String.format("%s:%s 数量%d 被批准", name, request.getRequestContent(), request.getNumber()));
        } else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
            System.out.println(String.format("%s:%s 数量%d 再说吧", name, request.getRequestContent(), request.getNumber()));
        }

    }
}
