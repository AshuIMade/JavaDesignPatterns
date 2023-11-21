package com.company.behavioural.state;

import com.company.behavioural.state.classicState.LightSwitch;

public class RunState {
    public static void demoState(){
        LightSwitch ls= new LightSwitch();
        ls.on();
        ls.off();
        ls.off();
    }
}
