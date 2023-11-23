package com.company.behavioural.visitors.classic;


public interface IExpressionVisitor {
    void visit(ClassicDoubleExpression e);
    void visit(ClassicAdditionExpression e);
}
