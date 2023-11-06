package com.company.behavioural.command;

public class BankAccountCmdWithoutUndo implements ICommand{
    public enum Action{
        DEPOSIT,
        WITHDRAW
    }
    private BankAccount account;
    private Action action;
    private int amount;

    public BankAccountCmdWithoutUndo(BankAccount account, Action action, int amount) {
        this.account = account;
        this.action = action;
        this.amount = amount;
    }
    @Override
    public void call() {
        switch (action){
            case DEPOSIT:
                account.deposit(amount);
                break;
            case WITHDRAW:
                account.withdraw(amount);
                break;
        }

    }
}
