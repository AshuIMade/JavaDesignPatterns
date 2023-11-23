package com.company.SOLIDdesignPrinciples.isp;

public class MultiFunctionPrinterBad implements MachineBad {
    @Override
    public void print(Document d) {
        System.out.println("Printing Doc..");
    }

    @Override
    public void fax(Document d) {
        System.out.println("Faxing Doc..");
    }

    @Override
    public void scan(Document d) {
        System.out.println("Scanning Doc..");
    }
}
