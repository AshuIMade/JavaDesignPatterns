package com.company.behavioural.observer.observerOne;

public class AgeChanger {
    public Person person;
    public AgeChanger(Person person){
        this.person=person;
    }
    public void changeAge(){
        for (int i=1;i<5;i++) {
            person.setAge(i);
        }
    }
}
