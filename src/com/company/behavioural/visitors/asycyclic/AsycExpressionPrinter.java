package com.company.behavioural.visitors.asycyclic;

public class  AsycExpressionPrinter implements IDoubleExpression,IAdditionExpression {
    StringBuilder sb= new StringBuilder();
    @Override
    public void visit(AsycDoubleExpression e) {
        sb.append(e.value);
    }

    @Override
    public void visit(AsycAdditionExpression e) {
        sb.append("(");
        e.left.accept(this);
        sb.append("+");
        e.right.accept(this);
        sb.append(")");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}
