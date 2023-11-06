package com.company.behavioural.chainOfResponsibility.brokerChain;

public class CreatureStrongModifier {
    protected Game game;
    protected CreatureStrong creatureStrong;

    public CreatureStrongModifier(Game game, CreatureStrong creatureStrong) {
        this.game = game;
        this.creatureStrong = creatureStrong;
    }
}
