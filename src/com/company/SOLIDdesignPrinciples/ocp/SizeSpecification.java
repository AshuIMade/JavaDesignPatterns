package com.company.SOLIDdesignPrinciples.ocp;

import java.util.List;
import java.util.stream.Stream;

public class SizeSpecification implements ISpecification<Product>{
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size==size;
    }
}
