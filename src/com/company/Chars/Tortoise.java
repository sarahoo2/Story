package com.company.Chars;

import com.company.Chars.Characters;

/**
 * Created by navenprasad25 on 31/03/2015.
 */
public class Tortoise extends Characters {

    public Tortoise(){
        super("Tortoise");
        System.out.println("Hi! says the Tortoise.");
        setSpeed();
    }

    public void setSpeed(){
        speed = 10;
    }

    public void getSleepy(){
        sleepy = false;
    }
}
