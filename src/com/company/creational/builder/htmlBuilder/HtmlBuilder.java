package com.company.creational.builder.htmlBuilder;

public class HtmlBuilder {
    private String rootName;
    private HtmlElement root= new HtmlElement();

    public HtmlBuilder(String rootName){
        this.rootName= rootName;
        root.name=rootName;
    }

    public void addChild(String name,String text){
        HtmlElement e=new HtmlElement(name,text);
        root.elements.add(e);
    }

    public void clear(){
        root=new HtmlElement();
        root.name=rootName;
    }

    @Override
    public String toString() {
        return root.toString();
    }
}
