package com.company.behavioural.command;


import java.util.Collections;
import java.util.List;

public class RunCommand {
    public static void demoCommandWithouUndo(){
        BankAccount ba = new BankAccount();
        System.out.println(ba);
        List<BankAccountCmdWithoutUndo> cmds=List.of(new BankAccountCmdWithoutUndo(ba,BankAccountCmdWithoutUndo.Action.DEPOSIT,100),
                new BankAccountCmdWithoutUndo(ba,BankAccountCmdWithoutUndo.Action.WITHDRAW,1000));
        for(BankAccountCmdWithoutUndo c:cmds){
            c.call();
            System.out.println(ba);
        }
    }
    public static void demoCommandWithUndo(){
        BankAccount ba = new BankAccount();
        System.out.println(ba);
        List<BankAccountCmdWithUndo> cmds= new java.util.ArrayList<>(List.of(
                new BankAccountCmdWithUndo(ba, BankAccountCmdWithUndo.Action.DEPOSIT, 100),
                new BankAccountCmdWithUndo(ba, BankAccountCmdWithUndo.Action.WITHDRAW, 1000)));
        for(ICommandWithUndo c:cmds){
            c.call();
            System.out.println("---"+ba);
        }
        Collections.reverse(cmds);
        for (ICommandWithUndo c:cmds){
            c.undo();
            System.out.println(ba);

        }
    }
}
