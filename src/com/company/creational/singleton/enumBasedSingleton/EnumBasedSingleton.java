package com.company.creational.singleton.enumBasedSingleton;

public enum EnumBasedSingleton {
    INSTANCE;
    private int value;
    EnumBasedSingleton(){
        value=42;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
