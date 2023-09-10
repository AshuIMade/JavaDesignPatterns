package com.company.structural.proxy.property;

public class Creature {
    private int strength;
    private Property<Integer> agility= new Property<>(10);


    public Creature(){
        //but this will not be receorded this means problem
        strength=123;
    }
    public void setAgility(int value){
        agility.setValue(value);
    }
    public int getAgility(){
        return agility.getValue();
    }
    public Creature(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        //log should be recorded here
        this.strength = strength;
    }
}
