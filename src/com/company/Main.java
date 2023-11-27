package com.company;

import com.company.SOLIDdesignPrinciples.RunSolid;

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
        RunSolid.demoIsp();
        RunSolid.demoDip();
        //CallCreationalRunners.callBuilders ();
        //RunStructuralDps.callFaced();
        //RunStructuralDps.callProxy();
        //CallBehavioralRunners.runBehaviouralPatterns();
    }
}
