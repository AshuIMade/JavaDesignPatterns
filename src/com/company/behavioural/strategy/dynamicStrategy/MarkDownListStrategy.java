package com.company.behavioural.strategy.dynamicStrategy;

public class MarkDownListStrategy implements ListStrategy{
    @Override
    public void addListItem(StringBuilder sb, String item) {
        sb.append("*")
                .append(item)
                .append(System.lineSeparator());
    }
}
