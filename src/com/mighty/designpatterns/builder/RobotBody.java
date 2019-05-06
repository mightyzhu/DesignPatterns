package com.mighty.designpatterns.builder;

/**
 * @author mighty
 * @create 2019-04-19 11:40
 */
public class RobotBody {

    private String material;

    private String shape;


    public RobotBody(String material, String shape) {
        this.material = material;
        this.shape = shape;
    }

    public String getMaterial() {
        return material;
    }

    public String getShape() {
        return shape;
    }

    public String getDescription(){
        return "材质："+ material + ", 形状：" + shape;

    }
}
