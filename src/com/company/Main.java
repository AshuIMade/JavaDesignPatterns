package com.company;

import com.company.SOLIDdesignPrinciples.RunSolid;
import com.company.behavioural.CallBehavioralRunners;
import com.company.creational.CallCreationalRunners;
import com.company.structural.RunStructuralDps;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        System.out.println("Main caller ...");
        try {
            RunSolid.demoSrp();
        }catch (Exception e){
            System.out.println(e);
        }
        RunSolid.demoOcp();
        RunSolid.demoLsp();
        //CallCreationalRunners.callBuilders ();
        //RunStructuralDps.callFaced();
        //RunStructuralDps.callProxy();
        //CallBehavioralRunners.runBehaviouralPatterns();
    }
}
