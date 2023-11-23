package com.company.behavioural.visitors.intrusive;

public class DoubleExpression extends Expression{
    //double Expression
    private double value;
    public DoubleExpression(double value){
        this.value=value;
    }

    @Override
    public void print(StringBuilder db) {
        db.append(value);

    }
}
