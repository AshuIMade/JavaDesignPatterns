package com.company.structural;

import com.company.structural.adapter.RunAdapters;
import com.company.structural.bridge.RunBridge;
import com.company.structural.composite.RunComposites;
import com.company.structural.decorator.RunDecorators;

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
    public static void callDecorators(){
        //RunDecorators.demoStringDecorator();
        //RunDecorators.demoDynamicDecorator();
        RunDecorators.demoAdapterDecorator();
    }
}
