package com.company.creational.builder;

import com.company.creational.builder.facetedBuilder.Employee;
import com.company.creational.builder.fluentBuilder.EmployeeBuilder;
import com.company.creational.builder.fluentBuilder.Person;
import com.company.creational.builder.fluentBuilder.PersonBuilder;
import com.company.creational.builder.htmlBuilder.FluentHtmlBuilder;
import com.company.creational.builder.htmlBuilder.HtmlBuilder;
import com.company.creational.builder.stringBuilder.UnorderedList;

public class RunBuilders {
    public static void runStringBuilder(){
        UnorderedList ul =new UnorderedList();
        ul.createUnorderedList();
    }
    public static void runHtmlBuilder(){
        HtmlBuilder builder= new HtmlBuilder("ul");
        builder.addChild("li","hello");
        builder.addChild("li","world");
        builder.addChild("li","form");
        builder.addChild("li","Html");
        builder.addChild("li","builder");
        System.out.println(builder);
    }
    public static void runFluentHtmlBuilder(){
        FluentHtmlBuilder builder= new FluentHtmlBuilder("ul");
        builder.addChild("li","hello")
                .addChild("li","world")
                .addChild("li","form")
                .addChild("li","Html")
                .addChild("li","builder");
        System.out.println(builder);
    }
    public static void runFluentPersonBuilder(){

        PersonBuilder pb=new PersonBuilder();
        Person dmitry= pb.withName("Dimtry").build();

        EmployeeBuilder ep= new EmployeeBuilder();
        Person ashuk=ep.withName("Ashuk")
                        .worksAt("Private employee").build();

        System.out.println(dmitry);
        System.out.println(ashuk);

    }
    public static void runFacetedBuilder(){
       com.company.creational.builder.facetedBuilder.EmployeeBuilder eb= new com.company.creational.builder.facetedBuilder.EmployeeBuilder();
        Employee employee=eb
                .lives()
                    .at("103 long ilang av")
                    .withPostalCode("1023")
                    .in("Los Angles")
                .works()
                    .at("Amazon")
                    .asA("Programer")
                    .earning(10254)
                .build();
        System.out.println(employee);


    }
    public static void runCombinedBuilder(){
       // ActorBuilder ab= new ActorBuilder();
        //Actor actor=ab.build().lives().
        //one day we may do Extendeble fluent facted builder

    }
}
