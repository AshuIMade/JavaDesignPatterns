package com.company.behavioural.visitors;

import com.company.behavioural.visitors.asycyclic.AsycAdditionExpression;
import com.company.behavioural.visitors.asycyclic.AsycDoubleExpression;
import com.company.behavioural.visitors.asycyclic.AsycExpressionPrinter;
import com.company.behavioural.visitors.classic.ClassicAdditionExpression;
import com.company.behavioural.visitors.classic.ClassicDoubleExpression;
import com.company.behavioural.visitors.classic.ClassicExpressionPrinter;
import com.company.behavioural.visitors.classic.ExpressionCalculator;
import com.company.behavioural.visitors.intrusive.AdditionExpression;
import com.company.behavioural.visitors.intrusive.DoubleExpression;
import com.company.behavioural.visitors.reflective.ExpressionPrinter;
import com.company.behavioural.visitors.reflective.NewAdditionExpression;
import com.company.behavioural.visitors.reflective.NewDoubleExpression;

public class RunVisitors {
    public static void demoIntrusiveVisitors(){
        //1+(2+3)
        AdditionExpression additionExpression = new AdditionExpression(
                new DoubleExpression(1),
                new AdditionExpression(
                        new DoubleExpression(2),
                        new DoubleExpression(3)
                )
        );
        StringBuilder sb = new StringBuilder();
        additionExpression.print(sb);
        System.out.println(sb);
    }
    public static void demoReflectiveVisitors(){
        NewAdditionExpression additionExpression = new NewAdditionExpression(
                new NewDoubleExpression(1),
                new NewAdditionExpression(
                        new NewDoubleExpression(2),
                        new NewDoubleExpression(3)
                )
        );
        StringBuilder sb = new StringBuilder();
        //ExpressionPrinter ep= new ExpressionPrinter();
        ExpressionPrinter.print(additionExpression,sb);
        System.out.println(sb);

    }
    public static void demoClassicVisitor(){
        ClassicAdditionExpression additionExpression = new ClassicAdditionExpression(
                new ClassicDoubleExpression(1),
                new ClassicAdditionExpression(
                        new ClassicDoubleExpression(2),
                        new ClassicDoubleExpression(3)
                )
        );
        ClassicExpressionPrinter cep= new ClassicExpressionPrinter();
        cep.visit(additionExpression);
        System.out.println(cep);
        ExpressionCalculator ec = new ExpressionCalculator();
        ec.visit(additionExpression);
        System.out.println(cep+ " = "+ ec.result);

    }

    public static void demoAsyclicVisitor(){
        AsycAdditionExpression additionExpression = new AsycAdditionExpression(
                new AsycDoubleExpression(1),
                new AsycAdditionExpression(
                        new AsycDoubleExpression(2),
                        new AsycDoubleExpression(3)
                )
        );
        AsycExpressionPrinter cep= new AsycExpressionPrinter();
        cep.visit(additionExpression);
        System.out.println(cep);
        //ExpressionCalculator ec = new ExpressionCalculator();
        //ec.visit(additionExpression);
        //System.out.println(cep+ " = "+ ec.result);

    }
}
