package com.company.creational.builder.facetedBuilder;


public class EmployeeAddressBuilder extends EmployeeBuilder {
    public EmployeeAddressBuilder(Employee employee){
        this.employee=employee;
    }
    public EmployeeAddressBuilder at(String streetAddress){
        employee.streetAddress=streetAddress;
        return this;
    }
    public EmployeeAddressBuilder withPostalCode(String postCode){
        employee.postCode=postCode;
        return this;
    }
    public EmployeeAddressBuilder in(String city){
        employee.city=city;
        return this;
    }
}
