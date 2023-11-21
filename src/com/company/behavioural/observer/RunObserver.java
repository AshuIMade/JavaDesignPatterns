package com.company.behavioural.observer;

import com.company.behavioural.observer.observerOne.AgeChanger;
import com.company.behavioural.observer.observerOne.ObserverAgeChange;
import com.company.behavioural.observer.observerOne.Person;
import com.company.behavioural.observer.observerOne.PropertyChangeEventArgs;
import com.company.behavioural.observer.observerTwo.AgeChangeEventSubscriber;
import com.company.behavioural.observer.observerTwo.Event;
import com.company.behavioural.observer.observerTwo.PersonAgeChanger;
import com.company.behavioural.observer.observerTwo.PersonNew;

public class RunObserver {
    public static void demoObserver(){
        Person person =new Person();
        AgeChanger ageChanger=new AgeChanger(person);
        ObserverAgeChange observerAgeChange=new ObserverAgeChange();
        observerAgeChange.subscribe(person);
        ageChanger.changeAge();
    }
    public static void demoObserverTwo(){
        PersonNew p= new PersonNew();
        AgeChangeEventSubscriber aces= new AgeChangeEventSubscriber(p);
        PersonAgeChanger pac= new PersonAgeChanger(p,17);
        pac= new PersonAgeChanger(p,18);
        pac= new PersonAgeChanger(p,19);
        aces.close();
        pac= new PersonAgeChanger(p,20);

    }
}
