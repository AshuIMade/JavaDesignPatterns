package com.company.behavioural.visitors.classic;

public class ClassicDoubleExpression extends ClassicExpression {
    //double Expression
    public double value;
    public ClassicDoubleExpression(double value){
        this.value=value;
    }

    @Override
    public void accept(IExpressionVisitor visitor) {
        visitor.visit(this);
    }
}
