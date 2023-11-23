package com.company.behavioural;

import com.company.behavioural.chainOfResponsibility.RunChainOfResponsibility;
import com.company.behavioural.command.RunCommand;
import com.company.behavioural.interpreter.RunInterpreter;
import com.company.behavioural.mediator.RunMediators;
import com.company.behavioural.momento.RunMemento;
import com.company.behavioural.nullObject.RunNullObject;
import com.company.behavioural.observer.RunObserver;
import com.company.behavioural.state.RunState;
import com.company.behavioural.strategy.RunStrategy;
import com.company.behavioural.templatemethod.RunTemplateMethod;
import com.company.behavioural.visitors.RunVisitors;

import java.util.function.DoubleUnaryOperator;

public class CallBehavioralRunners {
    public static void runBehaviouralPatterns(){
        //RunChainOfResponsibility.demoMethodChain();
        //RunChainOfResponsibility.demoEventBroker();
        //RunCommand.demoCommandWithUndo();
        //RunInterpreter.demoInterpreter();
        //RunMediators.demoMediatorChatroom();
       //RunMemento.demoMemento();
        //RunNullObject.demoNullObject();
        //RunState.demoState();
        //RunStrategy.demoStrategy();
        //RunStrategy.demoStaticStrategy();
        //RunTemplateMethod.demoTemplateMethod();
        RunVisitors.demoIntrusiveVisitors();
        RunVisitors.demoReflectiveVisitors();
        RunVisitors.demoClassicVisitor();
        RunVisitors.demoAsyclicVisitor();
    }
}
