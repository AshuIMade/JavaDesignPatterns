package com.company.behavioural.strategy.dynamicStrategy;

public interface ListStrategy {

    default void start(StringBuilder sb) { }

    void addListItem(StringBuilder sb,String item);

    default void end(StringBuilder sb){}
}
