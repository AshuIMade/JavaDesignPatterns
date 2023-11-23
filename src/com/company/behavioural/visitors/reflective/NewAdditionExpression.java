package com.company.behavioural.visitors.reflective;

public class NewAdditionExpression extends NewExpression {
    public NewExpression left,right;

    public NewAdditionExpression(NewExpression left, NewExpression right) {
        this.right=right;
        this.left = left;
    }

}
