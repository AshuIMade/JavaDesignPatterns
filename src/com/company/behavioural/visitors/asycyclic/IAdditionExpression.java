package com.company.behavioural.visitors.asycyclic;

public interface IAdditionExpression extends IVisitor{
    void visit(AsycAdditionExpression obj);
}
