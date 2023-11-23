package com.company.behavioural.visitors.asycyclic;

public class AsycAdditionExpression extends AsycExpression {
    public AsycExpression left,right;

    public AsycAdditionExpression(AsycExpression left, AsycExpression right) {
        this.right=right;
        this.left = left;
    }

    @Override
    public void accept(IVisitor visitor){
        if (visitor instanceof IAdditionExpression){
            ((IAdditionExpression) visitor).visit(this);
        }
    }
}
