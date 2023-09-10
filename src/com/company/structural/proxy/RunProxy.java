package com.company.structural.proxy;

import com.company.structural.proxy.dynamic.Human;
import com.company.structural.proxy.dynamic.LoggingHandler;
import com.company.structural.proxy.dynamic.Person;
import com.company.structural.proxy.property.Creature;
import com.company.structural.proxy.protection.Car;
import com.company.structural.proxy.protection.CarProtectionProxy;
import com.company.structural.proxy.protection.Driver;

import java.lang.reflect.Proxy;

public class RunProxy {
    public static void demoProtectionProxy(){
        Car car= new Car(new Driver(12));
        car.drive();
        Car car1= new CarProtectionProxy(new Driver(25));
        car.drive();
    }
    public static void demoPropertyProxy(){
        Creature creature= new Creature();
        //main purpose is to control fields form direct access
        creature.setAgility(10);
    }
    public static void demoDynamicProxy(){
        Person person= new Person();
        Human logged= withLogging(person,Human.class);
        logged.talk();
        logged.walk();
        logged.walk();
        System.out.println(logged);

    }
    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target,Class<T> itf){
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[]{itf},
                new LoggingHandler(target)
        );
    }
}
