package com.company.behavioural.chainOfResponsibility.methodChain;

public class NoBonessModifier extends CreatureModifier{
    public NoBonessModifier(Creature creature) {
        super(creature);
    }
    @Override
    public void handle(){
        System.out.println("No Bonuses For you");
    }
}
