package com.company.structural;

import com.company.structural.adapter.RunAdapters;
import com.company.structural.bridge.RunBridge;
import com.company.structural.composite.RunComposites;
import com.company.structural.decorator.RunDecorators;
import com.company.structural.facade.RunFaced;
import com.company.structural.flyWeight.RunFlyWeight;
import com.company.structural.proxy.RunProxy;

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
    public static void callFaced(){
        RunFaced.demoFaced();
    }
    public static void callFormatedText(){
        RunFlyWeight.demoFormatedText();
    }
    public static void callProxy(){
        //RunProxy.demoProtectionProxy();
        RunProxy.demoPropertyProxy();
        RunProxy.demoDynamicProxy();
    }
}
