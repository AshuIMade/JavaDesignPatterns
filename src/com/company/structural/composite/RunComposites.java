package com.company.structural.composite;

import com.company.structural.composite.geometric.Circle;
import com.company.structural.composite.geometric.GraphicObject;
import com.company.structural.composite.geometric.Square;
import com.company.structural.composite.nueron.Neuron;
import com.company.structural.composite.nueron.NeuronLayer;

public class RunComposites {
    public static void geometricCompositeDemo(){
        GraphicObject drawing= new GraphicObject();
        drawing.setName("My Drawing");
        drawing.children.add(new Square("Red"));
        drawing.children.add(new Circle("Blue"));
        GraphicObject group= new GraphicObject();
        group.children.add(new Square("Black"));
        group.children.add(new Square("White"));
        drawing.children.add(group);
        System.out.println(drawing);
    }
    public static void neuronComposite(){
        Neuron neuron = new Neuron();
        Neuron neuron1= new Neuron();
        NeuronLayer neuronLayer = new NeuronLayer();
        NeuronLayer neuronLayer1= new NeuronLayer();
        neuron.connectTo(neuron1);
        neuron.connectTo(neuronLayer);
        neuronLayer.connectTo(neuron);
        neuronLayer.connectTo(neuronLayer1);
    }
}
