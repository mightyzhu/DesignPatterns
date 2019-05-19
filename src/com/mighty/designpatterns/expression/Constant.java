package com.mighty.designpatterns.expression;

/**
 * @author mighty
 * @create 2019-05-19 1:13
 */
public class Constant extends Expression {
    private boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj instanceof Constant) {
            return this.value == ((Constant) obj).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean interpret(Context ctx) {

        return value;
    }

    @Override
    public String toString() {
        return  Boolean.toString(value);
    }

}

