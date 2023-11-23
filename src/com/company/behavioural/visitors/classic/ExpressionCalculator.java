package com.company.behavioural.visitors.classic;

public class ExpressionCalculator implements IExpressionVisitor{
    public double result;
    @Override
    public void visit(ClassicDoubleExpression e) {
        result=e.value;
    }

    @Override
    public void visit(ClassicAdditionExpression e) {
        e.left.accept(this);
        double a= result;
        e.right.accept(this);
        double b=result;
        result =a+b;
    }
}
