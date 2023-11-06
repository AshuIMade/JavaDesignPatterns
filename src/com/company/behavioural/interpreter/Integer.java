package com.company.behavioural.interpreter;

public class Integer implements IElement{
    private int value;

    public Integer(int value) {
        this.value = value;
    }

    @Override
    public int eval() {
        return value;
    }
}
