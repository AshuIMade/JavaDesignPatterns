package com.company.behavioural.nullObject;

import java.lang.reflect.Proxy;

public class RunNullObject {
    @SuppressWarnings("unchecked")
    public static <T> T noOp(Class<T> itf){
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[]{itf},
                ((proxy,method,args)->{
                    if(method.getReturnType().equals(Void.TYPE))
                        return null;
                    else
                        return method.getReturnType().getConstructor().newInstance();
                })
        );
    }
    public static void demoNullObject(){
        ILog log= noOp(ILog.class);
        BankAccount ba= new BankAccount(log,100);
        //this creates truble if the coder dos not code defensively
        BankAccount ba1= new BankAccount(null,100);

        ba.deposit(100);
    }
}
