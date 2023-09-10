package com.company.structural.proxy.dynamic;

public class Person implements Human{
    @Override
    public void talk() {
        System.out.println("I am talking");
    }

    @Override
    public void walk() {
        System.out.println("I am walking ");

    }
}
