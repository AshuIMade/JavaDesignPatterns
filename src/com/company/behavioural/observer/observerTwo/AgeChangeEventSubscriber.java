package com.company.behavioural.observer.observerTwo;


public class AgeChangeEventSubscriber {
    Event<PropertyEventArgs>.Subscription sub;
    public AgeChangeEventSubscriber(PersonNew personNew){
        sub=personNew.propertyChangedEventArgs.addHandler(x->{
           System.out.println("Person's "+x.propertyName+ " has changed ");
        });
    }
    public void close(){
        sub.close();
    }

}
