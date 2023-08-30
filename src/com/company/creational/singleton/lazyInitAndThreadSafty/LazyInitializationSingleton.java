package com.company.creational.singleton.lazyInitAndThreadSafty;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){
        System.out.println("Initializing Lazy only Singleton");
    }
    public static LazyInitializationSingleton getInstance(){
        if (instance==null){
            instance =new LazyInitializationSingleton();
        }
        return instance;
    }
    //this has performance issues
    public static synchronized LazyInitializationSingleton getInstanceTwo(){
        if (instance==null){
            instance =new LazyInitializationSingleton();
        }
        return instance;
    }
}
