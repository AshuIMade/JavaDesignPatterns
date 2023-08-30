package com.company.creational.factory.factoryMethod;

public class PointWithFactory {
    private double x,y;
    private PointWithFactory(double x,double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "PointWithFactory{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static class Factory{
        public static PointWithFactory newCartesianPoint(double x,double y){
            return new PointWithFactory(x,y);
        }
        public static PointWithFactory newPolarPoint(double rho,double theta){
            return new PointWithFactory(rho*Math.cos(theta),rho*Math.sin(theta));
        }
    }
}
