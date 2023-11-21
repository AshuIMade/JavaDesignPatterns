package com.company.behavioural.state.classicState;

public class OffState extends State{
    public OffState(){
        System.out.println("light turned off");
    }
    @Override
    public void on(LightSwitch ls){
        System.out.println("Switching light on...");
        ls.setState(new OnState());
    }

}
