package com.company.structural.decorator.dynamicDecorator;

public class ColoredShape implements IShape{
    private IShape shape;
    private String color;
    public ColoredShape(IShape shape, String color){
        this.shape=shape;
        this.color=color;
    }
    @Override
    public String info() {
        return shape.info() +" has a color "+ color;
    }
}
