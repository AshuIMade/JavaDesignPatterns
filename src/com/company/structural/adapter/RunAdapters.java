package com.company.structural.adapter;

import com.company.structural.adapter.hashedAdapter.LineToPointAdapterHashed;
import com.company.structural.adapter.vectorRaster.LineToPointAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunAdapters {
    public static void runVectorRasterAdapter(){
        List<VectorObject> vectorObjects= new ArrayList<>(Arrays.asList(
           new VectorRectangle(1,1,10,10),
                new VectorRectangle(3,3,6,6)
        ));
        for (VectorObject vo: vectorObjects){
            for(Line line:vo){
                LineToPointAdapter lineToPointAdapter= new LineToPointAdapter(line);
                lineToPointAdapter.forEach(GivenInterface::drawPoint);
            }
        }
    }
    public static void runVectorRasterAdapterHashed(){
        List<VectorObject> vectorObjects= new ArrayList<>(Arrays.asList(
                new VectorRectangle(1,1,10,10),
                new VectorRectangle(3,3,6,6)
        ));
        for (VectorObject vo: vectorObjects){
            for(Line line:vo){
                LineToPointAdapterHashed lineToPointAdapterHashed= new LineToPointAdapterHashed(line);
                lineToPointAdapterHashed.forEach(GivenInterface::drawPoint);
            }
        }
    }
}
