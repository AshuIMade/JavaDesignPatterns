package com.company.creational.builder.stringBuilder;

public class UnorderedList {
    public void createUnorderedList(){
        String[] wordLists={"Hello", "world","Form","Builder"};
        StringBuilder sb= new StringBuilder();
        //this is a nice api given by String Builder
        sb.append("<ul>\n");
        for (String w:wordLists) {
            sb.append(String.format(" <li> %s </li>\n",w));
        }
        sb.append("</ul>\n");
        System.out.println(sb);
    }
}
