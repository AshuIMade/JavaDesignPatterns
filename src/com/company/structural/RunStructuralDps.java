package com.company.structural;

import com.company.structural.adapter.RunAdapters;
import com.company.structural.bridge.RunBridge;
import com.company.structural.composite.RunComposites;

public class RunStructuralDps {
    public static void callAdapters(){
        //RunAdapters.runVectorRasterAdapter();
        RunAdapters.runVectorRasterAdapterHashed();
        RunAdapters.runVectorRasterAdapterHashed();
    }
    public static void callBridge(){
        RunBridge.bridgeDemo();

    }

    public static void callComposites(){
        RunComposites.geometricCompositeDemo();
        RunComposites.neuronComposite();
    }
}
