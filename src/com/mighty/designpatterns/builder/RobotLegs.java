package com.mighty.designpatterns.builder;

/**
 * @author mighty
 * @create 2019-04-19 11:45
 */
public class RobotLegs {

    public RobotLegs(String material, String shape) {
        this.material = material;
        this.shape = shape;
    }

    private String material;

    private String shape;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getDescription(){
        return "材质："+ material + ", 形状：" + shape;

    }
}
