package com.company.structural.facade;

public class RunFaced {
    public static void demoFaced(){
        Buffer buffer= new Buffer(30,20);
        ViewPort viewPort= new ViewPort(buffer,30,20,0,0);
        Console console= new Console(30,20);
        console.addViewPort(viewPort);
        console.render();

        //Console console1=Console.newConsole(30,20);
        //console1.render();

    }
}
