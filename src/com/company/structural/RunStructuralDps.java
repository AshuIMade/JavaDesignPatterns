package com.company.structural;

import com.company.structural.adapter.RunAdapters;
import com.company.structural.bridge.RunBridge;

public class RunStructuralDps {
    public static void callAdapters(){
        //RunAdapters.runVectorRasterAdapter();
        RunAdapters.runVectorRasterAdapterHashed();
        RunAdapters.runVectorRasterAdapterHashed();
    }
    public static void callBridge(){
        RunBridge.bridgeDemo();

    }
}
