package com.company.creational.builder.facetedBuilder;

public class EmployeeJobBuilder extends EmployeeBuilder{
    public EmployeeJobBuilder(Employee employee){
        this.employee=employee;
    }
    public EmployeeJobBuilder at(String companyName){
        employee.companyName=companyName;
        return this;
    }
    public EmployeeJobBuilder asA(String position){
        employee.position=position;
        return this;
    }
    public EmployeeJobBuilder earning(int annoulIncome){
        employee.annoulIncome=annoulIncome;
        return this;
    }
}
