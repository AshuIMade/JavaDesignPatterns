package com.company.behavioural.chainOfResponsibility.brokerChain;

public class IncreaseDefenseMod extends CreatureStrongModifier implements AutoCloseable{
    private final int token;
    public IncreaseDefenseMod(Game game, CreatureStrong creatureStrong) {
        super(game, creatureStrong);
        token=game.queries.subscribe(q->{
            if(q.creatureName.equals(creatureStrong.name)&&q.argument==Query.Argument.DEFENSE){
                q.result+=3;
            }
        });
    }

    @Override
    public void close() throws Exception {
        game.queries.unSubscribe(token);
    }
}
