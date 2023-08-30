package com.company.creational.singleton;

import com.company.creational.singleton.InnerStaticSingleton.InnerSingleton;
import com.company.creational.singleton.basicSinglton.BasicSingleton;
import com.company.creational.singleton.enumBasedSingleton.EnumBasedSingleton;
import com.company.creational.singleton.enumBasedSingleton.EnumBasedSingletonDemo;
import com.company.creational.singleton.lazyInitAndThreadSafty.LazyInitThreadSafeWaySingleton;
import com.company.creational.singleton.lazyInitAndThreadSafty.LazyInitializationSingleton;
import com.company.creational.singleton.monostate.ChiefExecutiveOfficer;
import com.company.creational.singleton.multiton.Printer;
import com.company.creational.singleton.multiton.SubSystems;
import com.company.creational.singleton.staticBlock.StaticBlockSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RunSingletons {

    public static void runBasicSingleton(){
        BasicSingleton basicSingleton=BasicSingleton.getInstance();
        basicSingleton.setValue(222);
        System.out.println(basicSingleton.getValue());
        BasicSingleton basicSingleton1=BasicSingleton.getInstance();
        basicSingleton.setValue(111);
        System.out.println(basicSingleton1.getValue());
        System.out.println(basicSingleton==basicSingleton1);
    }
    public static void runProblemWithSingleton(){
        // we can actually create instances with
        //1. reflection
        //2. serialization
        //lets demonstrate serialization and deserialization breaks this singleton
        BasicSingleton basicSingleton= BasicSingleton.getInstance();
        basicSingleton.setValue(222);
        String fileName="basicSingleton.bin";
        try{
            saveToFIle(basicSingleton,fileName);
        }catch (Exception exception){
            System.out.println(exception);
        }
        basicSingleton.setValue(111);
        try{
            BasicSingleton basicSingleton1=readFromFile(fileName);
            System.out.println(basicSingleton==basicSingleton1);
            System.out.println(basicSingleton.getValue());
            System.out.println(basicSingleton1.getValue());
        }catch (Exception ecException){
            System.out.println(ecException);
        }

    }
    public static void runLazyOnlySingleton(){
        LazyInitializationSingleton lazyInitializationSingleton= LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton lazyInitializationSingleton1=LazyInitializationSingleton.getInstanceTwo();
        System.out.println(lazyInitializationSingleton1==lazyInitializationSingleton);
        LazyInitThreadSafeWaySingleton lazyInitThreadSafeWaySingleton= LazyInitThreadSafeWaySingleton.getInstance();
    }
    public static void runInnerSingleton(){
        InnerSingleton innerSingleton= InnerSingleton.getInstance();
        InnerSingleton innerSingleton1=InnerSingleton.getInstance();
        System.out.println(innerSingleton1==innerSingleton);
    }
    public static void runEnumbasedSingleton(){
        String fileName="myFile.bin";
        //EnumBasedSingleton enumBasedSingleton=EnumBasedSingleton.INSTANCE;
        //enumBasedSingleton.setValue(111);
        EnumBasedSingletonDemo enumBasedSingletonDemo= new EnumBasedSingletonDemo();
        //enumBasedSingletonDemo.saveToFile(enumBasedSingleton,fileName);
        EnumBasedSingleton enumBasedSingleton1=enumBasedSingletonDemo.readFromFile(fileName);
        System.out.println(enumBasedSingleton1.getValue());
    }
    public static void runMonostateSingleton(){
        ChiefExecutiveOfficer chiefExecutiveOfficer= new ChiefExecutiveOfficer();
        chiefExecutiveOfficer.setAge(42);
        chiefExecutiveOfficer.setName("Adam Smith");
        ChiefExecutiveOfficer chiefExecutiveOfficer1 = new ChiefExecutiveOfficer();
        System.out.println(chiefExecutiveOfficer1);
    }
    public static void runMultitonSingleton(){
        Printer main = Printer.getPrinter(SubSystems.Primary);
        Printer aux=Printer.getPrinter(SubSystems.Auxiliary);
        Printer aux3=Printer.getPrinter(SubSystems.Auxiliary);
    }

    public static void runStaticBlockSingleton(){
        StaticBlockSingleton staticBlockSingleton= StaticBlockSingleton.getInstance();
        staticBlockSingleton.setValue(111);
        System.out.println(staticBlockSingleton.getValue());
    }
    static void saveToFIle(BasicSingleton basicSingleton,
                                  String fileName) throws Exception{
        try(FileOutputStream fileOutputStream= new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);){
            objectOutputStream.writeObject(basicSingleton);
        }

    }
    static BasicSingleton readFromFile(String fileName) throws Exception{
        try(FileInputStream fileInputStream =new FileInputStream(fileName);
            ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);) {
            return (BasicSingleton) objectInputStream.readObject();
        }
    }
}
