package com.company.structural.flyWeight;

import com.company.structural.flyWeight.repeatingUsernames.User;
import com.company.structural.flyWeight.repeatingUsernames.UserTwo;
import com.company.structural.flyWeight.textFormating.BetterFormatedText;
import com.company.structural.flyWeight.textFormating.FormatedText;

public class RunFlyWeight {
    public static void demoFlyWeight(){
        User user=new User("Jhon Smith");
        User user1= new User("Jane Smith");
        //UserTwo userTwo= new UserTwo(user);

    }
    public static void demoFormatedText(){
        FormatedText formatedText= new FormatedText("this is a brave new world");
        formatedText.capitalize(10,15);
        System.out.println(formatedText);
        BetterFormatedText bft= new BetterFormatedText("make america great again");
        bft.getRange(13,18).capitalize=true;
        System.out.println(bft);
    }
}
