package com.company.creational.factory;

import com.company.creational.factory.factoryMethod.Point;
import com.company.creational.factory.factoryMethod.PointWithFactory;

public class RunFactories {
    public static void runPointFactory(){
        Point point=Point.newCartesianPoint(2.0,3.0);
        Point point1=Point.newPolarPoint(1.0,30.0);
        PointWithFactory pwf= PointWithFactory.Factory.newPolarPoint(3,4);
        PointWithFactory pwf2= PointWithFactory.Factory.newPolarPoint(3,45);
        System.out.println(point);
        System.out.println(point1);
        System.out.println(pwf);
        System.out.println(pwf2);


    }
    public static void runAbstractFactory(){

    }
}
