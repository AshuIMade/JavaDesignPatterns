package com.company.behavioural.visitors.asycyclic;

public class AsycDoubleExpression extends AsycExpression{
    //double Expression
    public double value;
    public AsycDoubleExpression(double value){
        this.value=value;
    }

    @Override
    public void accept(IVisitor visitor){
        if (visitor instanceof IDoubleExpression){
            ((IDoubleExpression) visitor).visit(this);
        }
    }
}
