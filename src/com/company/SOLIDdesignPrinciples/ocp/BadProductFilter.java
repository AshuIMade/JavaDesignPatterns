package com.company.SOLIDdesignPrinciples.ocp;

import java.util.List;
import java.util.stream.Stream;

public class BadProductFilter {
    public Stream<Product> filterByColor(List<Product> products,Color color){
        return products.stream().filter(p->p.color==color);
    }
    public Stream<Product> filterBySize(List<Product> products,Size size){
        return products.stream().filter(p->p.size==size);
    }
    public Stream<Product> filterByColorAndSize(List<Product> products,Color color,Size size){
        return products.stream().filter(p-> p.color==color && p.size==size);
    }
}
