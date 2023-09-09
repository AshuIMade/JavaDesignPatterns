package com.company.structural.decorator.staticDecorator;

import com.company.structural.decorator.dynamicDecorator.IShape;

import java.util.function.Supplier;

public class StaticColoredShape<T extends IShape> implements IShape {
    private IShape shape;
    private String color;
    public StaticColoredShape(Supplier<? extends T> ctor,String color){
        shape= ctor.get();
        this.color=color;
    }
    @Override
    public String info() {
        return shape.info() +" has color "+color;
    }
}
