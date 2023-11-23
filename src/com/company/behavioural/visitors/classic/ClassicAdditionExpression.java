package com.company.behavioural.visitors.classic;

public class ClassicAdditionExpression extends ClassicExpression {
    public ClassicExpression left,right;

    public ClassicAdditionExpression(ClassicExpression left, ClassicExpression right) {
        this.right=right;
        this.left = left;
    }

    @Override
    public void accept(IExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
