package com.company.creational.builder.fluentBuilder;

public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder>{

    public EmployeeBuilder worksAt(String position){
        person.setPosition(position);
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}
