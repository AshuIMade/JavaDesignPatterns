package com.company.structural.decorator.dynamicDecorator;

public class Circle implements IShape{
    private float radius;

    public Circle(){

    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public void resize(float factor){
        radius=radius*factor;
    }

    @Override
    public String info() {
        return "A Circle of radius "+ radius;
    }
}
