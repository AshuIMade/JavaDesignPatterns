package com.company.SOLIDdesignPrinciples.dip;

import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Relationships implements RelationshipBrowser{
    // thre is a list
    private List<Triplet<Person,Relationship,Person>> relations= new ArrayList<>();

    //geter
    public List<Triplet<Person,Relationship,Person>> getRelations(){
        return relations;
    }

    //adder
    public void addParentAndChild(Person parent,Person child){
        relations.add(new Triplet<>(parent,Relationship.PARENT,child));
        relations.add(new Triplet<>(child,Relationship.CHILD,parent));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relations.stream()
                .filter(x-> Objects.equals(x.getValue0().name,name) && x.getValue1()==Relationship.PARENT)
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }
}
