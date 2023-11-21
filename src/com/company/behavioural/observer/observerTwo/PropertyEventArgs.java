package com.company.behavioural.observer.observerTwo;

import com.company.behavioural.observer.observerOne.PropertyChangeEventArgs;

public class PropertyEventArgs {
    public Object source;
    public String propertyName;

    public PropertyEventArgs(Object source, String propertyName) {
        this.source = source;
        this.propertyName = propertyName;
    }
}
