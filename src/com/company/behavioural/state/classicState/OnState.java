package com.company.behavioural.state.classicState;

public class OnState extends State{
    public OnState(){
        System.out.println("Light is turned on...");
    }

    @Override
    public void off(LightSwitch ls){
        System.out.println("Switching light off...");
        ls.setState(new OffState());
    }
}
