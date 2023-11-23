package com.company.behavioural.visitors.asycyclic;

public class AsycExpressionCalculator implements IAdditionExpression,IDoubleExpression {
    public double result;
    @Override
    public void visit(AsycDoubleExpression e) {
        result=e.value;
    }

    @Override
    public void visit(AsycAdditionExpression e) {
        e.left.accept(this);
        double a= result;
        e.right.accept(this);
        double b=result;
        result =a+b;
    }
}
