package com.company.creational.builder.htmlBuilder;

public class FluentHtmlBuilder {
    private String rootName;
    private HtmlElement root= new HtmlElement();

    public FluentHtmlBuilder(String rootName){
        this.rootName= rootName;
        root.name=rootName;
    }

    public FluentHtmlBuilder addChild(String name,String text){
        HtmlElement e=new HtmlElement(name,text);
        root.elements.add(e);
        return this;
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
