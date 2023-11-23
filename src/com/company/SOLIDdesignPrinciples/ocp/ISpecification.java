package com.company.SOLIDdesignPrinciples.ocp;

public interface ISpecification<T> {
    boolean isSatisfied(T item);
}
