package com.mighty.designpatterns.expression;

/**
 * @author mighty
 * @create 2019-05-19 1:20
 */
public class Or extends Expression {
    private Expression left,right;

    public Or(Expression left , Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Or)
        {
            return this.left.equals(((Or)obj).left) && this.right.equals(((Or)obj).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean interpret(Context ctx) {
        return left.interpret(ctx) || right.interpret(ctx);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " OR " + right.toString() + ")";
    }

}
