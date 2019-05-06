package com.mighty.designpatterns.builder;

/**
 * @author mighty
 * @create 2019-04-19 11:43
 */
public class RobotArms {

    private String material;

    private String appearance;

    public RobotArms(String material, String appearance) {
        this.material = material;
        this.appearance = appearance;
    }

    public String getMaterial() {
        return material;
    }

    public String getAppearance() {
        return appearance;
    }

    public String getDescription(){
        return "材质："+ material + ", 外观：" + appearance;

    }
}
