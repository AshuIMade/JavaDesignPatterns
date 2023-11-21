package com.company.behavioural.nullObject;

public class BankAccount {
    private ILog log;
    private int balance;
    public BankAccount(ILog log,int balance){
        this.balance=balance;
        this.log=log;
    }
    public void deposit(int amount){
        balance+=amount;
        //defensive coding
        if(log!=null)
            log.info("Deposited "+amount);
    }
}
