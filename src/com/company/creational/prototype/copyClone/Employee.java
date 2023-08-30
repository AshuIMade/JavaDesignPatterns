package com.company.creational.prototype.copyClone;

public class Employee {
    public String name;
    public Addr addr;

    public Employee(String name, Addr addr) {
        this.name = name;
        this.addr = addr;
    }

    public Employee(Employee other){
        name= other.name;
        addr= new Addr(other.addr);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", addr=" + addr +
                '}';
    }
}
