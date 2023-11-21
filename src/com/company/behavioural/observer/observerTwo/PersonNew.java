package com.company.behavioural.observer.observerTwo;

public class PersonNew {
    private int age;
    public Event<PropertyEventArgs> propertyChangedEventArgs=
            new Event<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (this.age==age) return;
        boolean oldCanVote=getCanVote();
        this.age = age;
        propertyChangedEventArgs.fire(new PropertyEventArgs(this,"age"));
        if (oldCanVote!=getCanVote()){
            propertyChangedEventArgs.fire(new PropertyEventArgs(this,"canVote"));
        }
    }
    public boolean getCanVote(){
        return age>=18;
    }
}
