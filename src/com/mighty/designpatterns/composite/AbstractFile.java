package com.mighty.designpatterns.composite;

/**
 * 抽象文件类：抽象构件
 *
 * @author mighty
 * @create 2019-05-09 15:13
 */
public abstract class AbstractFile {

    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();

}
