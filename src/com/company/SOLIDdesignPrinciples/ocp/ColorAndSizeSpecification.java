package com.company.SOLIDdesignPrinciples.ocp;

public class ColorAndSizeSpecification implements ISpecification<Product>{

    //this is not good implementation
    private Color color;
    private Size size;

    public ColorAndSizeSpecification(Color color, Size size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product item) {
        return item.size==size && item.color==color;
    }
}
