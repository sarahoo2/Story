package com.company.Chars;

/**
 * Created by navenprasad25 on 31/03/2015.
 */
public abstract class Characters {
    private String name;

    protected int speed = 10;
    protected boolean sleepy = false;

    Characters(){
        name = "NONE";

    }


    Characters(String theName){
        name = theName;

    }

    public abstract void setSpeed();
    public abstract void getSleepy();

    public int getSpeed(){
        return speed;
    }

    public String getName(){
        return name;
    }

    public boolean isSleepy(){
        return sleepy;
    }

}
