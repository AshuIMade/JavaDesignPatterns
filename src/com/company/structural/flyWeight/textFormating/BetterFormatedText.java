package com.company.structural.flyWeight.textFormating;

import java.util.ArrayList;
import java.util.List;

public class BetterFormatedText {
    private String plainText;
    private List<TextRange> formating= new ArrayList<>();
    //private List<>

    public BetterFormatedText(String plainText) {
        this.plainText = plainText;
    }
    public TextRange getRange(int start, int end){
        TextRange textRange= new TextRange(start,end);
        formating.add(textRange);
        return textRange;
    }
    @Override
    public String toString() {
        StringBuilder sb= new StringBuilder();
        for (int i=0;i<plainText.length();++i){
            char c= plainText.charAt(i);
            for (TextRange range:formating) {
                if (range.covers(i)&&range.capitalize)
                    c=Character.toUpperCase(c);

            }
            sb.append(c);

        }
        return sb.toString();
    }

    public class TextRange{
        public int start, end;
        public boolean capitalize, bold, italic;

        public TextRange(int start, int end) {
            this.start = start;
            this.end = end;
        }
        public boolean covers(int position){
            return position>=start&&position<=end;

        }
    }
}
