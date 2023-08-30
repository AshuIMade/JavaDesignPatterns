package com.company.creational.singleton.problemsInSinglton;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class SingletonDatabase {
    private Dictionary<String,Integer> capitals=new Hashtable<>();
    private static int instanceCount=0;
    private static int getInstanceCount(){return instanceCount;}
    private SingletonDatabase(){
        instanceCount++;
        System.out.println("Initializing the database");
        try {
            File file= new File(SingletonDatabase.class.getProtectionDomain().getCodeSource().getLocation().getPath());
            Path fullPath= Paths.get(file.getPath(),"Capital.txt");
            List<String> lines= Files.readAllLines(fullPath);
            //Iterables.partition(lines,2).

        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
