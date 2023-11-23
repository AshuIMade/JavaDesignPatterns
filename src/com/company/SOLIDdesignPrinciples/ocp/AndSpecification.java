package com.company.SOLIDdesignPrinciples.ocp;

public class AndSpecification<T> implements ISpecification<T> {
    private ISpecification<T> left,right;

    public AndSpecification(ISpecification<T> left, ISpecification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfied(T item) {
        return left.isSatisfied(item) &&right.isSatisfied(item) ;
    }
}
