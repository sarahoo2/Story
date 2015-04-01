package com.company;

import com.company.Chars.Characters;
import com.company.Chars.Rabbit;
import com.company.Chars.Tortoise;

/**
 * Created by navenprasad25 on 31/03/2015.
 */
public class Jungle {
    private static int capacity = 8;

    public Characters createAnimal(String animalType){
        if(capacity > 0 && animalType == "Rabbit"){
            Characters rabbit = new Rabbit();
            capacity = capacity - 1;
            return rabbit;
        }else{
            if(capacity > 0 && animalType == "Tortoise"){
                Characters tortoise = new Tortoise();
                capacity = capacity - 1;
                return tortoise;
            }else{
                System.out.println("No such animal exist!");
                Characters none =  new Rabbit();
                none = null;
                return none;
            }
        }
    } // animalType is the name of animal

    public int checkCapacity(){
        return capacity;
    }

    public void startRace(Characters x, Characters y){
        Race raceOne = new Race(x);
        Thread t1  = new Thread(raceOne);
        t1.start();
        Race raceTwo = new Race(y);
        Thread t2  = new Thread(raceTwo);
        t2.start();
    }

    public void killCharacter(Characters x){
        System.out.println(x.getName() + "is to be killed!");
        x = null;
        System.out.println(x.getName());

    }
}
