package com.company.structural.decorator.staticDecorator;

import com.company.structural.decorator.dynamicDecorator.IShape;

import java.util.function.Supplier;

public class StaticTransparentShape<T extends IShape> implements IShape {
    private IShape shape;
    private int taransparency;
    public StaticTransparentShape(Supplier<? extends T> ctor,int taransparency){
        shape=ctor.get();
        this.taransparency=taransparency;

    }
    @Override
    public String info() {
        return shape.info()+ " has tarnsparency " +taransparency +" % transparency";
    }
}
