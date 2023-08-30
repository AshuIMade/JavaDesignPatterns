package com.company.creational.singleton.enumBasedSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnumBasedSingletonDemo {
    public void saveToFile(EnumBasedSingleton singleton,String fileName){
        try(FileOutputStream fileOutputStream= new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);) {
            objectOutputStream.writeObject(singleton);
        }catch (Exception exception){
            System.out.println("Exception happened!");
        }
    }
    public EnumBasedSingleton readFromFile(String fileName){
        EnumBasedSingleton enumBasedSingleton =null;
        try (FileInputStream fileInputStream= new FileInputStream(fileName);
             ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream)){
            enumBasedSingleton= (EnumBasedSingleton) objectInputStream.readObject();

        }catch (Exception exception){
            System.out.println("exception happended");
        }
        return enumBasedSingleton;
    }
}
