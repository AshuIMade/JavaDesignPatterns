package com.company;

import com.company.creational.CallCreationalRunners;
import com.company.structural.RunStructuralDps;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        System.out.println("Main caller ...");
        //CallCreationalRunners.callBuilders ();
        RunStructuralDps.callComposites();
    }
}
