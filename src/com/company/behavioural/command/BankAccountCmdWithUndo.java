package com.company.behavioural.command;

public class BankAccountCmdWithUndo implements ICommandWithUndo{

    public enum Action{
        DEPOSIT,
        WITHDRAW
    }
    private BankAccount bankAccount;
    private Action action;
    private int amount;
    private boolean succeeded;

    public BankAccountCmdWithUndo(BankAccount bankAccount, Action action, int amount) {
        this.bankAccount = bankAccount;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void call() {
        switch (action){
            case DEPOSIT:
                succeeded=true;
                bankAccount.deposit(amount);
                break;
            case WITHDRAW:
                succeeded=bankAccount.withdraw(amount);
                break;
        }
    }

    @Override
    public void undo() {
        if (!succeeded) return;
        switch (action){
            case DEPOSIT:
                bankAccount.withdraw(amount);
                break;
            case WITHDRAW:
                bankAccount.deposit(amount);
                break;
        }
    }

}
