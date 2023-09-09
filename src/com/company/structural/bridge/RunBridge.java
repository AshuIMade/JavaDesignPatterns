package com.company.structural.bridge;

import com.company.structural.bridge.shapeRendering.Circle;
import com.company.structural.bridge.shapeRendering.RasterRenderer;
import com.company.structural.bridge.shapeRendering.VectorRenderer;

public class RunBridge {
    public static void bridgeDemo(){
        RasterRenderer rasterRenderer= new RasterRenderer();
        VectorRenderer vectorRenderer=new VectorRenderer();
        Circle circle=new Circle(rasterRenderer,5);
        circle.draw();
        circle.resize(2);
        circle.draw();
    }
}
