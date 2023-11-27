package com.company.SOLIDdesignPrinciples;

import com.company.SOLIDdesignPrinciples.dip.Person;
import com.company.SOLIDdesignPrinciples.dip.Relationships;
import com.company.SOLIDdesignPrinciples.dip.Research;
import com.company.SOLIDdesignPrinciples.isp.Document;
import com.company.SOLIDdesignPrinciples.isp.PhotoCopier;
import com.company.SOLIDdesignPrinciples.lsp.Rectangle;
import com.company.SOLIDdesignPrinciples.lsp.Square;
import com.company.SOLIDdesignPrinciples.ocp.*;
import com.company.SOLIDdesignPrinciples.srp.Journal;
import com.company.SOLIDdesignPrinciples.srp.Persistence;

import java.util.List;

public class RunSolid {
    public static void demoSrp() throws Exception{
        Journal j=new Journal();
        j.addEntry("I ate a bug");
        j.addEntry("I do some programing");

        j.addEntry("Did it work");
        System.out.println(j);
        Persistence p= new Persistence();
        String fileName="E:\\javatemp\\tmp.txt";
        p.save(j,fileName,true);
        Runtime.getRuntime().exec("notepad.exe"+fileName);
    }
    public static void demoOcp(){
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        List<Product> products= List.of(apple,house,tree);
        BadProductFilter bpf = new BadProductFilter();
        System.out.println("all green products by Bad Filter: ");
        bpf.filterByColor(products,Color.GREEN).forEach(p->System.out.println(" - "+p.name+" is green"));

        BetterFilter bf= new BetterFilter();
        ColorSpecification cspec= new ColorSpecification(Color.GREEN);
        System.out.println("all green products by Better Filter: ");
        bf.filter(products,cspec).forEach(p->System.out.println(" - "+p.name+" is green"));

        System.out.println("Large green items: ");
        bf.filter(products,new AndSpecification<>(
                new ColorSpecification(Color.GREEN),
                new SizeSpecification(Size.LARGE)
        )).forEach(p->System.out.println("- "+p.name+ " is large and green"));
    }
    public static void demoLsp(){
        Rectangle r=new Rectangle(2,3);
        Rectangle sq= new Square();
        sq.setWidth(5);
        useIt(r);
        useIt(sq);
    }
    public static void demoIsp(){
        PhotoCopier photoCopier= new PhotoCopier();
        photoCopier.print(new Document());
        photoCopier.scan(new Document());




    }
    public static void demoDip(){
        Person jhon = new Person("Jhon");
        Person child1 = new Person("Chris");
        Person child2 = new Person("Matt");
        Relationships relationships=new Relationships();
        relationships.addParentAndChild(jhon,child1);
        relationships.addParentAndChild(jhon,child2);
        new Research(relationships);


    }
    public static void useIt(Rectangle r){
        int width= r.getWidth();
        r.setHeight(10);
        System.out.println("Expected Area of "+ (width *10)+ " but got " +r.getArea());

    }
}
