package com.company;

import com.company.Chars.Characters;

/**
 * Created by navenprasad25 on 31/03/2015.
 */
public class Race implements Runnable {

    private Characters One;

    Race(Characters x){
        One = x;
    }

     public void run(){
        System.out.println();
         int speed = One.getSpeed();
         System.out.println(speed);
         int lengthLeft = 1000;
         while( lengthLeft > 0){
             System.out.println(One.getName()+ " has " + lengthLeft + " ");
             lengthLeft = lengthLeft - One.getSpeed();
             if(One.isSleepy()){
                 try{
                    Thread.sleep(1);
                 }catch(Exception e){
                     System.out.println(e);
                 }

             }
         }
         System.out.println(One.getName() + " has completed the race!");

     }


}
