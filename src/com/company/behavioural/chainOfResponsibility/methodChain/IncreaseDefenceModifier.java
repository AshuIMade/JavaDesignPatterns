package com.company.behavioural.chainOfResponsibility.methodChain;

public class IncreaseDefenceModifier extends CreatureModifier{
    public IncreaseDefenceModifier(Creature creature) {
        super(creature);
    }
    @Override
    public void handle(){
        System.out.println("Increase "+creature.name+"'s defence");
        creature.defence+=3;
        super.handle();
    }
}
