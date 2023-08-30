package com.company.creational.prototype;

import com.company.creational.prototype.copyClone.Addr;
import com.company.creational.prototype.copyClone.Employee;
import com.company.creational.prototype.iclonableInterface.Address;
import com.company.creational.prototype.iclonableInterface.Person;
import com.company.creational.prototype.searializable.Foo;

public class RunPrototypes {
    public static void runIClonableInterface() throws CloneNotSupportedException {
        Person jhon=new Person(
                new String[]{"Jhon","Smith"},
                new Address("London Road",123));
        Person jane= (Person) jhon.clone();
        jane.names[0]="jane";
        jane.address.houseNumber=124;
        System.out.println(jhon);
        System.out.println(jane);
    }
    public static void runCopyClone(){
        Employee jhon=new Employee("Jhon",new Addr("Loandon Road","London","Uk"));
        Employee chris=new Employee(jhon);
        chris.name="Chris";
        System.out.println(jhon);
        System.out.println(chris);
    }
    public static void runSearializableClone(){
        Foo foo=new Foo(42,"life");
        //Foo foo2=SerializationUtils().roundtrip(foo);
        //no serialzion round trip
        //foo2.life("Xyz");
        //System.out.println(foo)
        //System.out.println(foo2)
    }
}
