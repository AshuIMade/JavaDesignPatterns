package com.company.structural.decorator.dynamicDecorator;

public class Square implements IShape{
    private float side;

    public Square(){

    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    public Square(float side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "A Square with side " +side;
    }
}
