package com.company.SOLIDdesignPrinciples.ocp;

import java.util.List;
import java.util.stream.Stream;

public class BetterFilter implements IFilter<Product>{
    @Override
    public Stream<Product> filter(List<Product> items, ISpecification spec) {
        return items.stream().filter(p->spec.isSatisfied(p));
    }
}
