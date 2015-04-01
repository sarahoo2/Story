package com.company.Chars;

import com.company.Chars.Characters;

/**
 * Created by navenprasad25 on 31/03/2015.
 */
public class Rabbit extends Characters {

    public Rabbit(){
        super("Rabbit");
        System.out.println("Hi! says the Rabbit.");
        setSpeed();
    }

    public void setSpeed(){
        speed = 30;
    }

    public  void getSleepy(){
        sleepy = true;
    }


}
