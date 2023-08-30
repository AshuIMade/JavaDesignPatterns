package com.company.creational.singleton.staticBlock;

import java.io.File;
import java.io.IOException;

public class StaticBlockSingleton {
    private int value=0;

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton Object IS being initialized");
        File.createTempFile(".",".");
    }
    private static StaticBlockSingleton instance;

    static {
        try {
            instance= new StaticBlockSingleton();
        }catch (Exception exception){
            System.err.println("Failed To create Singleton: "+exception);
        }
    }
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    protected Object readResolve(){
        return instance;
    }
}
