package com.company.behavioural;

import com.company.behavioural.chainOfResponsibility.RunChainOfResponsibility;
import com.company.behavioural.command.RunCommand;
import com.company.behavioural.interpreter.RunInterpreter;
import com.company.behavioural.mediator.RunMediators;
import com.company.behavioural.momento.RunMemento;

public class CallBehavioralRunners {
    public static void runBehaviouralPatterns(){
        //RunChainOfResponsibility.demoMethodChain();
        //RunChainOfResponsibility.demoEventBroker();
        //RunCommand.demoCommandWithUndo();
        //RunInterpreter.demoInterpreter();
        //RunMediators.demoMediatorChatroom();
        RunMemento.demoMemento();
    }
}
