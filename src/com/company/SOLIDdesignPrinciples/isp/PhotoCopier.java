package com.company.SOLIDdesignPrinciples.isp;

public class PhotoCopier implements Scanner,Printer{
    @Override
    public void print(Document d) {
        System.out.println("Printing doc..");
    }

    @Override
    public void scan(Document d) {
        System.out.println("Scanning Doc ...");
    }
}
