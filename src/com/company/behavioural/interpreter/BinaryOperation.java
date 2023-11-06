package com.company.behavioural.interpreter;

public class BinaryOperation implements IElement{
    public enum Opp{
        ADDITION,
        SUBTRACTION
    }
    public Opp opp;
    public IElement left,right;

    @Override
    public int eval() {
        switch (opp){
            case ADDITION:
                return left.eval()+ right.eval();
            case SUBTRACTION:
                return left.eval()- right.eval();
            default:
                return 0;
        }
    }
}
