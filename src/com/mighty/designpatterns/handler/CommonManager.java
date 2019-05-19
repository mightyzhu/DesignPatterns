package com.mighty.designpatterns.handler;

/**
 * 项目经理
 * @author mighty
 * @create 2019-05-13 22:27
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(WorkRequest request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.println(String.format("%s:%s 数量%d 被批准", name, request.getRequestContent(), request.getNumber()));
        } else {
            if (superior != null) {
                superior.requestApplications(request);
            }
        }

    }
}
