package com.company.structural.composite.geometric;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphicObject {
    protected String name ="group";
    public String color;
    public List<GraphicObject> children= new ArrayList<>();
    public GraphicObject(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private void print(StringBuilder sb,int depth){
        sb.append(String.join("", Collections.nCopies(depth,"*")))
                .append(depth>0?" ":"")
                .append((color==null||color.isEmpty())?"":color+ "")
                .append(getName())
                .append(System.lineSeparator());
        for (GraphicObject child:children) {
            child.print(sb,depth);
        }
    }
    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        print(sb,0);
        return sb.toString();
    }
}
