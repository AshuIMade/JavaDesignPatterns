package com.company.creational.singleton.multiton;

import java.util.HashMap;

public class Printer {
    private static int count=0;
    private static HashMap<SubSystems,Printer> instances= new HashMap<>();
    private Printer(){
        count++;
        System.out.println("TOtal number of instances reached "+ count);
    }
    public static Printer getPrinter(SubSystems subSystems){
        if(instances.containsKey(subSystems))
            return instances.get(subSystems);
        Printer printer= new Printer();
        instances.put(subSystems,printer);
        return printer;
    }
}
