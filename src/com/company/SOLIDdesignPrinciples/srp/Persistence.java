package com.company.SOLIDdesignPrinciples.srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.net.URL;

public class Persistence {
    //this should be implemented
     public void save(Journal journal,String fileName,boolean overWrite) throws FileNotFoundException {
         if(overWrite||new File(fileName).exists()){
             try(PrintStream out= new PrintStream(fileName)) {
                 out.println(journal.toString());
             }
         }
     }

     public void load(String fileName){}
     public void load(URL url){}
}
