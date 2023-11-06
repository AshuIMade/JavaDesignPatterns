package com.company.behavioural.chainOfResponsibility.brokerChain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<Args> {
    private int index=0;
    private Map<Integer, Consumer<Args>> handlers=new HashMap<>();
    public int subscribe(Consumer<Args> handler){
        int i=index;
        handlers.put(index++,handler);
        return i;
    }
    public void unSubscribe(int key){
        handlers.remove(key);
    }
    public void fire(Args args){
        for (Consumer<Args> handler:handlers.values()) {
            handler.accept(args);
        }
    }

}

