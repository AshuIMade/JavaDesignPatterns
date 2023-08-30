package com.company.creational;

import com.company.creational.builder.RunBuilders;
import com.company.creational.factory.RunFactories;
import com.company.creational.prototype.RunPrototypes;
import com.company.creational.singleton.RunSingletons;

public class CallCreationalRunners {
    public static void callBuilders() throws CloneNotSupportedException {
        //RunBuilders.runStringBuilder();
        //RunBuilders.runHtmlBuilder();
        //RunBuilders.runFluentHtmlBuilder();
        //RunBuilders.runFluentPersonBuilder();
        //RunBuilders.runFacetedBuilder();
        //RunFactories.runPointFactory();
        //RunPrototypes.runIClonableInterface();
        //RunPrototypes.runCopyClone();
        //RunSingletons.runBasicSingleton();
        //RunSingletons.runProblemWithSingleton();
        //RunSingletons.runStaticBlockSingleton();
        //RunSingletons.runLazyOnlySingleton();
        //RunSingletons.runInnerSingleton();
        //RunSingletons.runEnumbasedSingleton();
        //RunSingletons.runMonostateSingleton();
        RunSingletons.runMultitonSingleton();
    }
}
