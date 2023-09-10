package com.company.structural.proxy.protection;

public class CarProtectionProxy extends Car{
    public CarProtectionProxy(Driver driver) {
        super(driver);
    }
    @Override
    public void drive(){
        if (driver.age>=16)
            super.drive();
        else
            System.out.println("Driver too you");
    }
}
