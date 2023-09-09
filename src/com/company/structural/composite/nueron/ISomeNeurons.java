package com.company.structural.composite.nueron;

public interface ISomeNeurons extends Iterable<Neuron>{
    default void connectTo(ISomeNeurons other){
        if (this==other) return;
        for (Neuron from:this) {
            for (Neuron to:other) {
                from.out.add(to);
                to.in.add(from);
            }
        }
    }

}
