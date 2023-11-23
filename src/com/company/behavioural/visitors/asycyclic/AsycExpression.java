package com.company.behavioural.visitors.asycyclic;

public abstract class AsycExpression {
    public void accept(IVisitor visitor){
        if (visitor instanceof IAsycExpressionVisitor){
            ((IAsycExpressionVisitor) visitor).visit(this);
        }
    }
}
