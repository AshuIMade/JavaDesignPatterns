package com.company.creational.factory.abstractFactory;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class HotDrinkMachine {
    private List<Dictionary<String,IHotDrinkFactory>> namedFactory=new ArrayList<>();
    public HotDrinkMachine(){
        //new Reflections("").getSubTypes
        //other things..........
        //create instances..........
        //Set<Class<? extends IHotDrinkFactory>> types= new Reflections(" ").getS
    }
    public IHotDrink makeDrink(){
        //lots of impl
        //create maker.............
        return null;
    }
}
