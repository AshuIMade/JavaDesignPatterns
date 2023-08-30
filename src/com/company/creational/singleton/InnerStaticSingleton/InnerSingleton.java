package com.company.creational.singleton.InnerStaticSingleton;

public class InnerSingleton {
    private InnerSingleton(){
        System.out.println("This is Threadsafe Singleton implementation ");

    }
    private static class Iml{
        private static final InnerSingleton INSTANCE= new InnerSingleton();
    }
    public static InnerSingleton getInstance(){
        return Iml.INSTANCE;
    }
}
