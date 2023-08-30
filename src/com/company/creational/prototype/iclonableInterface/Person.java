package com.company.creational.prototype.iclonableInterface;

import java.util.Arrays;

public class Person implements Cloneable {
    public String[] names;
    public Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //tempted to dothis
        //return new Person(names,address);
        //but do this
        return new Person(names.clone(), (Address) address.clone());
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }
}
