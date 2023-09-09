package com.company.structural.decorator.dynamicDecorator;

public class TransparentShape implements IShape{
    private IShape shape;
    private int transparency;

    public TransparentShape(IShape shape, int transparency) {
        this.shape = shape;
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() +" has " +transparency+ "% transparency";
    }
}
