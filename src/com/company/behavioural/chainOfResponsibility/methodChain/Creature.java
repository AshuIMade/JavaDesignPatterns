package com.company.behavioural.chainOfResponsibility.methodChain;

public class Creature {
    public String name;
    public int attack,defence;

    public Creature(String name,int attack,int defence){
        this.name=name;
        this.attack=attack;
        this.defence=defence;
    }

    @Override
    public String toString() {
        return "CreatureStrong{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defence=" + defence +
                '}';
    }
}
