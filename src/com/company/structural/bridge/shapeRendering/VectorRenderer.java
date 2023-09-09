package com.company.structural.bridge.shapeRendering;

public class VectorRenderer implements IRenderer{
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius"+radius);
    }
}
