package com.company.behavioural.chainOfResponsibility.brokerChain;

public class CreatureStrong {
    private Game game;
    public String name;
    public int baseAttack,baseDefence;

    public CreatureStrong(Game game, String name, int baseAttack, int baseDefence) {
        this.game = game;
        this.name = name;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
    }
    public int getAttack(){
        Query q=new Query(name, Query.Argument.ATTACK,baseAttack);
        game.queries.fire(q);
        return q.result;
    }
    public int getDefence(){
        Query q=new Query(name, Query.Argument.DEFENSE,baseDefence);
        game.queries.fire(q);
        return q.result;
    }

    @Override
    public String toString() {
        return "CreatureStrong{" +
                "game=" + game +
                ", name='" + name + '\'' +
                ", baseAttack=" + getAttack() +
                ", baseDefence=" + getDefence() +
                '}';
    }
}
