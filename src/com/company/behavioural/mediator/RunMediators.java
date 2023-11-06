package com.company.behavioural.mediator;

import com.company.behavioural.mediator.chatroom.ChaRoom;
import com.company.behavioural.mediator.chatroom.Person;
import com.company.behavioural.mediator.reactiveExtension.EventBroker;
import com.company.behavioural.mediator.reactiveExtension.FootballCoach;
import com.company.behavioural.mediator.reactiveExtension.FootballPlayer;

public class RunMediators {
    public static void demoMediatorChatroom(){
        //intilize
        ChaRoom room= new ChaRoom();
        Person jhon = new Person("jhon");
        Person jane = new Person("jane");
        //then join
        room.join(jhon);
        room.join(jane);
        //chat
        jhon.say("hi room!");
        jane.say("oh, Hey jhon");
        //new person join
        Person simon = new Person("Simon");
        room.join(simon);
        simon.say("hi Everyone!");
        //then jane send private message
        jane.privateMessage("Simon","glad you could join us");
    }
    public static void demoMediatorReactiveExtension(){
        /**
        EventBroker eventBroker = new EventBroker();
        FootballPlayer jones=new FootballPlayer(eventBroker,"jones");
        FootballCoach footballCoach = new FootballCoach(eventBroker);
        jones.score();
        jones.score();
        jones.score();
         */

    }

}
