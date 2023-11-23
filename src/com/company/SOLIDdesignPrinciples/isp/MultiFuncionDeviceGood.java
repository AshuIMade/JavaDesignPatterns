package com.company.SOLIDdesignPrinciples.isp;

public class MultiFuncionDeviceGood implements MultiFunctionDevice{
    //decorator design pattern
    private Printer printer;
    private Scanner scanner;

    public MultiFuncionDeviceGood(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void faxing(Document d) {

    }

    @Override
    public void print(Document d) {
        printer.print(d);

    }

    @Override
    public void scan(Document d) {
        scanner.scan(d);

    }
}
