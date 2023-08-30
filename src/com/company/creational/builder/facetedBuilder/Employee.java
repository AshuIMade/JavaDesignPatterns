package com.company.creational.builder.facetedBuilder;

public class Employee {
    //may have address
    public String streetAddress,postCode,city;
    //employemnt
    public String companyName,position;
    public int annoulIncome;

    @Override
    public String toString() {
        return "Employee{" +
                "streetAddress='" + streetAddress + '\'' +
                ", postCode='" + postCode + '\'' +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", position='" + position + '\'' +
                ", annoulIncome=" + annoulIncome +
                '}';
    }
}
