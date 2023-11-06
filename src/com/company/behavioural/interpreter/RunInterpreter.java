package com.company.behavioural.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RunInterpreter {
    static List<Token> lex(String input){
        ArrayList<Token> result=new ArrayList<>();
        for (int i=0;i<input.length();++i){
            switch (input.charAt(i)){
                case '+':
                    result.add(new Token(Token.Type.PLUS,"+"));
                    break;
                case '-':
                    result.add(new Token(Token.Type.MINUS,"-"));
                    break;
                case '(':
                    result.add(new Token(Token.Type.LPAREN,"("));
                    break;
                case ')':
                    result.add(new Token(Token.Type.RPAREN,")"));
                    break;
                default:
                    StringBuilder sb=new StringBuilder(""+input.charAt(i));
                    for (int j=i+1;j<input.length();++j){
                        if(Character.isDigit(input.charAt(j))){
                            sb.append(input.charAt(j));
                            ++i;
                        }else {
                            result.add(new Token(Token.Type.INTEGER,sb.toString()));
                            break;
                        }
                    }
                    break;
            }
        }
        return result;
    }

    static IElement parse(List<Token> tokens){
        BinaryOperation result= new BinaryOperation();
        Boolean haveLHS=false;
        for (int i = 0; i < tokens.size(); ++i) {
            Token token=tokens.get(i);

            switch (token.type){
                case INTEGER:
                    Integer integer= new Integer(java.lang.Integer.parseInt(token.text));
                    if (!haveLHS){
                        result.left=integer;
                        haveLHS=true;
                    }else {
                        result.right=integer;
                    }
                    break;
                case PLUS:
                    result.opp=BinaryOperation.Opp.ADDITION;
                    break;
                case MINUS:
                    result.opp=BinaryOperation.Opp.SUBTRACTION;
                    break;
                case LPAREN:
                    int j=i;
                    for(;j< tokens.size();++j)
                        if(tokens.get(j).type==token.type.RPAREN)
                            break;
                    List<Token> subExpression= tokens.stream()
                            .skip(i + 1)
                            .limit(j - i - 1)
                            .collect(Collectors.toList());
                    IElement element=parse(subExpression);
                    if(!haveLHS){
                        result.left=element;
                        haveLHS=true;
                    }else result.right=element;
                    i=j;
                    break;
            }
            
        }
        return result;
    }

    public static void demoInterpreter(){
        String input="(13+4)-(12+1)";
        List<Token> tokens=lex(input);
        System.out.println(tokens.stream().map(t->t.toString()).collect(Collectors.joining("\t")));
        IElement parsed=parse(tokens);
        System.out.println(input+ " = "+parsed.eval());

    }
}
