package com.company.behavioural.observer.observerOne;

public class Person extends Observable<Person> {
    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age==age) return;
        this.age = age;
        propertyChanged(this,"age",age);
    }
}
