package com.company.behavioural.observer.observerOne;

public class ObserverAgeChange implements IObserver<Person> {
    public void subscribe(Person person){
        person.subscribe(this);
    }
    @Override
    public void handle(PropertyChangeEventArgs<Person> args) {
        System.out.println("Persons "+args.propertyName+" has changed to: "+args.newValue);

    }
}
