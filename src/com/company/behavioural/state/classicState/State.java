package com.company.behavioural.state.classicState;

public class State {
    public void on(LightSwitch ls){
        System.out.println("Ligfht is already on...");
    }
    public void off(LightSwitch ls){
        System.out.println("Ligfht is already off...");
    }
}
