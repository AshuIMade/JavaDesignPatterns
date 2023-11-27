package com.company.SOLIDdesignPrinciples.dip;

import org.javatuples.Triplet;

import java.util.List;

public class Research {
    public Research(Relationships relationships,String cool){
        List<Triplet<Person,Relationship,Person>> relations= relationships.getRelations();
        relations.stream()
                .filter(x->x.getValue0().name.equals("Jhon") && x.getValue1()==Relationship.PARENT)
                .forEach(ch-> System.out.println("Jhon has a child called "+ ch.getValue2().name));
    }
    public Research(RelationshipBrowser browser){
        List<Person> children= browser.findAllChildrenOf("Jhon");
        for (Person child:children){
            System.out.println("Jhon has a child called "+ child.name);
        }
    }
}
