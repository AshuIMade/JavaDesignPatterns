package com.company.behavioural.state.handmadeState;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum State{
    OFF_HOOK,
    ON_HOOK,
    CONNECTING,
    CONNECTED,
    ON_HOLD
}
enum Trigger{
    CALL_DIALED,
    HANG_UP,
    CALL_CONNECTED,
    PLACED_ON_HOLD,
    TAKEN_OFF_HOLD,
    LEFT_MESSAGE,
    STOP_USING_PHONE
}
public class EnumStateMachine {
    private static Map<State, List<Map<Trigger,State>>>
            rules= new HashMap<>();

    static {
        //rules.put(State.OFF_HOOK,List.of(
          //      new HashMap<Trigger,State>(Trigger.CALL_DIALED,State.CONNECTING),
            //    new HashMap<>(Trigger.STOP_USING_PHONE,State.ON_HOOK)));
    }


}
