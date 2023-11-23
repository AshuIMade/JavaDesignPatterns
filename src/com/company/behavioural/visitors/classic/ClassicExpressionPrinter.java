package com.company.behavioural.visitors.classic;

public class ClassicExpressionPrinter implements IExpressionVisitor{
    StringBuilder sb= new StringBuilder();
    @Override
    public void visit(ClassicDoubleExpression e) {
        sb.append(e.value);
    }

    @Override
    public void visit(ClassicAdditionExpression e) {
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
