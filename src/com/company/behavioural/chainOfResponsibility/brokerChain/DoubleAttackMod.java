package com.company.behavioural.chainOfResponsibility.brokerChain;

public class DoubleAttackMod extends CreatureStrongModifier implements AutoCloseable{
    private final int token;
    public DoubleAttackMod(Game game, CreatureStrong creatureStrong) {
        super(game, creatureStrong);
        token=game.queries.subscribe(q->{
           if(q.creatureName.equals(creatureStrong.name)&&q.argument==Query.Argument.ATTACK){
               q.result*=2;
           }
        });
    }

    @Override
    public void close() /*throws Exception*/ {
        game.queries.unSubscribe(token);
    }
}
