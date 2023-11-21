package com.company.behavioural.strategy;

import com.company.behavioural.strategy.dynamicStrategy.HtmlListStrategy;
import com.company.behavioural.strategy.dynamicStrategy.MarkDownListStrategy;
import com.company.behavioural.strategy.dynamicStrategy.OutputFormat;
import com.company.behavioural.strategy.dynamicStrategy.TextProcessor;
import com.company.behavioural.strategy.staticStrategy.NewTextProcessor;

import java.util.List;

public class RunStrategy {
    public static void demoStrategy(){
        TextProcessor textProcessor = new TextProcessor(OutputFormat.MARKDOWN);
        textProcessor.appendList(List.of("Liberite","Egalite","Faternite"));
        System.out.println(textProcessor);
        textProcessor.clear();
        textProcessor.setOutputFormat(OutputFormat.HTML);
        textProcessor.appendList(List.of("Inheritance","Encapsulation","Polymorphisim"));
        System.out.println(textProcessor);
    }
    public static void demoStaticStrategy(){
        NewTextProcessor<MarkDownListStrategy> ntp=new
                NewTextProcessor<>(MarkDownListStrategy::new);
        ntp.appendList(List.of("Alpha","Beta","Gamma"));
        System.out.println(ntp);
        NewTextProcessor<HtmlListStrategy> ntp2=new
                NewTextProcessor<>(HtmlListStrategy::new);
        ntp2.appendList(List.of("Ashuk","Belahu","Ene"));
        System.out.println(ntp2);
    }
}
