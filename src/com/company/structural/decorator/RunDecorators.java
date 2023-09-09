package com.company.structural.decorator;

import com.company.structural.decorator.adapterDecorator.MyStringBuilder;
import com.company.structural.decorator.dynamicDecorator.Circle;
import com.company.structural.decorator.dynamicDecorator.ColoredShape;
import com.company.structural.decorator.dynamicDecorator.Square;
import com.company.structural.decorator.dynamicDecorator.TransparentShape;
import com.company.structural.decorator.staticDecorator.StaticColoredShape;
import com.company.structural.decorator.staticDecorator.StaticTransparentShape;
import com.company.structural.decorator.stringDecorator.MagicString;

public class RunDecorators {
    public static void demoStringDecorator(){
        MagicString magicString= new MagicString("Hello World");
        System.out.println(magicString + " has "+ magicString.countVowels() + " vowels");
    }

    public static void demoDynamicDecorator(){
        Circle circle=new Circle(10);
        System.out.println(circle.info());
        ColoredShape blueSquare= new ColoredShape(new Square(10),"Blue");
        System.out.println(blueSquare.info());
        TransparentShape transparentShape=new TransparentShape(
                new ColoredShape(new Circle(10),"Green"),50);
        System.out.println(transparentShape.info());
    }
    public static void demoStaticDecorator(){
        StaticColoredShape<Square> blueSquare= new StaticColoredShape<>(
                ()->new Square(20),"Blue"
        );
        System.out.println(blueSquare.info());
        StaticTransparentShape<StaticColoredShape<Circle>> myCircle= new StaticTransparentShape<>(
                ()->new StaticColoredShape<>(()-> new Circle(10),"Green"),10);
        System.out.println(myCircle.info());
    }
    public static void demoAdapterDecorator(){
        MyStringBuilder msb=new MyStringBuilder();
        msb.append("Hello").appendLine(" World");
        System.out.println(msb.concat("and this too"));
    }
}