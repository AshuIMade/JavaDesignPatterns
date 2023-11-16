package com.company.behavioural.momento;

public class RunMemento {
    public static void demoMemento(){
        BankAccount ba= new BankAccount(100);
        Memento m1= ba.deposit(50);
        Memento m2= ba.deposit(25);
        System.out.println(ba);
        ba.restore(m1);
        System.out.println(ba);
        ba.restore(m2);
        System.out.println(ba);
    }

}
