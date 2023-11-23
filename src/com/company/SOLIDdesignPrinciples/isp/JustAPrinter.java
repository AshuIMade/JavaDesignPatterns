package com.company.SOLIDdesignPrinciples.isp;

public class JustAPrinter implements Printer{
    @Override
    public void print(Document d) {
        System.out.println("Printing Doc..");
    }
}
