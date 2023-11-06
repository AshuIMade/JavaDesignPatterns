package com.company.behavioural.chainOfResponsibility;

import com.company.behavioural.chainOfResponsibility.brokerChain.CreatureStrong;
import com.company.behavioural.chainOfResponsibility.brokerChain.DoubleAttackMod;
import com.company.behavioural.chainOfResponsibility.brokerChain.Game;
import com.company.behavioural.chainOfResponsibility.brokerChain.IncreaseDefenseMod;
import com.company.behavioural.chainOfResponsibility.methodChain.*;

public class RunChainOfResponsibility {
    public static void demoMethodChain(){
        Creature creature=new Creature("Goblin",2,2);
        System.out.println(creature);
        CreatureModifier root= new CreatureModifier(creature);
        root.add(new NoBonessModifier(creature));
        System.out.println("Double goblins attack");
        root.add(new DoubleAttackModifier(creature));
        System.out.println("lets Increase goblins defence ");
        root.add(new IncreaseDefenceModifier(creature));
        root.handle();
        System.out.println(creature);

    }
    public static void demoEventBroker(){
        Game game=new Game();
        CreatureStrong goblin= new CreatureStrong(game,"Goblin",2,2);
        System.out.println(goblin);
        IncreaseDefenseMod idm=new IncreaseDefenseMod(game,goblin);
        DoubleAttackMod dam=new DoubleAttackMod(game,goblin);
        try(dam) {
            System.out.println(goblin);
        }
        System.out.println(goblin);
    }
}
