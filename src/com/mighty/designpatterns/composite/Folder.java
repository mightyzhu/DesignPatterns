package com.mighty.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹类：容器构件
 *
 * @author mighty
 * @create 2019-05-09 15:38
 */
public class Folder extends AbstractFile {

    private String name;

    //定义集合fileList，用于存储AbstractFile类型的成员
    private List<AbstractFile> fileList = new ArrayList<AbstractFile>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒

        for (AbstractFile file: fileList) {
            file.killVirus();
        }
    }
}
