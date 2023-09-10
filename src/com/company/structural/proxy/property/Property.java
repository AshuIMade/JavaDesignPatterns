package com.company.structural.proxy.property;

import java.util.Objects;

public class Property<T> {
    private T value;

    public Property(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        // you can perform loging
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property<?> property = (Property<?>) o;
        return value!=null?Objects.equals(value, property.value):property.value==null;
    }

    @Override
    public int hashCode() {
        return value!=null?Objects.hash(value):0;
    }
}
