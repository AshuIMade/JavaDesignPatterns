package com.company.creational.singleton.lazyInitAndThreadSafty;

public class LazyInitThreadSafeWaySingleton {
    private static LazyInitThreadSafeWaySingleton instance;

    private LazyInitThreadSafeWaySingleton(){
        System.out.println("Lazy and thread safe double check locking without additional problems initialized Singleton");
    }
    //this method is called double check locking but remember it is outdated
    public static LazyInitThreadSafeWaySingleton getInstance(){
        if (instance == null){
            synchronized (LazyInitThreadSafeWaySingleton.class){
                if (instance ==null){
                    instance= new LazyInitThreadSafeWaySingleton();
                }
            }

        }
        return instance;
    }

}
