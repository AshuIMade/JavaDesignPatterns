package com.company.behavioural.nullObject;

public class ConsoleLog implements ILog{
    @Override
    public void info(String msg) {
        System.out.println(msg);
    }

    @Override
    public void warn(String msg) {
        System.out.println("Warning : "+msg);

    }
}
