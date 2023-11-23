package com.company.behavioural.visitors.intrusive;

public class AdditionExpression extends Expression{
    private Expression left,right;

    public AdditionExpression(Expression left,Expression right) {
        this.right=right;
        this.left = left;
    }

    @Override
    public void print(StringBuilder db) {
        db.append("(");
        left.print(db);
        db.append("+");
        right.print(db);
        db.append(")");


    }
}
