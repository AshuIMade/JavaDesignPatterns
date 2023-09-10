package com.company.structural.flyWeight.repeatingUsernames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class UserTwo {
    public static List<String> strings= new ArrayList<>();
    private int[] names;
    public UserTwo(String fullName){
        Function<String,Integer> getOrAdd=(String s)->{
            int idx=strings.indexOf(s);
            if (idx!=-1) return idx;
            else {
                strings.add(s);
                return strings.size();
            }
        };
        names= Arrays.stream(fullName.split(" ")).mapToInt(s->getOrAdd.apply(s)).toArray();

    }
}
