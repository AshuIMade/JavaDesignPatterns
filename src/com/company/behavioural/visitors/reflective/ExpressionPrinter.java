package com.company.behavioural.visitors.reflective;

import com.company.behavioural.visitors.intrusive.AdditionExpression;
import com.company.behavioural.visitors.intrusive.DoubleExpression;

public class ExpressionPrinter {
    public static void print(NewExpression ne,StringBuilder sb){
        //this is what we call reflection
        if(ne.getClass()== NewDoubleExpression.class){
            sb.append(((NewDoubleExpression) ne).value);
        }else if(ne.getClass()== NewAdditionExpression.class) {
            NewAdditionExpression na= (NewAdditionExpression) ne;
            sb.append("(");
            print(na.left,sb);
            sb.append("+");
            print(na.right,sb);
            sb.append(")");


        }

    }
}
