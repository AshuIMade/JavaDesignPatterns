package com.company.structural.proxy.protection;

public class Car implements IDraivable{
    protected Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    @Override
    public void drive() {
        System.out.println("Car beign Driven");
    }
}
