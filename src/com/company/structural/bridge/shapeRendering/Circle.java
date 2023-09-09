package com.company.structural.bridge.shapeRendering;

public class Circle extends Shape{
    public float radius;

    public Circle(IRenderer renderer) {
        super(renderer);
    }
    public Circle(IRenderer renderer,float radius){
        super(renderer);
        this.radius=radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }

    @Override
    public void resize(float factor) {
        radius=radius*factor;
    }
}
