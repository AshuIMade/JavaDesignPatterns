package com.company.behavioural.observer.observerOne;

public interface IObserver<T> {
    void handle(PropertyChangeEventArgs<T> args);
}
