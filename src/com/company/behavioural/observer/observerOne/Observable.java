package com.company.behavioural.observer.observerOne;

import java.util.ArrayList;
import java.util.List;

public class Observable<T> {
    private List<IObserver<T>> observers=new ArrayList<>();
    public void subscribe(IObserver<T> observer){
        observers.add(observer);
    }
    protected void propertyChanged(T source,String propertyName,Object newValue){
        for (IObserver observer:observers){
            observer.handle(new PropertyChangeEventArgs(source,propertyName,newValue));
        }
    }
}
