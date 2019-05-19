package com.mighty.designpatterns.handler;

/**
 * @author mighty
 * @create 2019-05-13 22:22
 */
public abstract class Manager {
    protected String name;

    // 上级管理者
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    /**
     * 设置管理者的上级
     *
     * @param superior 上级
     */
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract public void requestApplications(WorkRequest request);
}
