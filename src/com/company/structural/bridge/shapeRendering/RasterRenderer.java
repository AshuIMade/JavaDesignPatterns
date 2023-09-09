package com.company.structural.bridge.shapeRendering;

public class RasterRenderer implements IRenderer{
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a pixel of Circles of radius"+radius);
    }
}
