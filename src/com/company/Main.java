package com.company;

import com.company.Chars.Characters;
import com.company.Chars.Rabbit;

public class Main {

    public static void main(String[] args) {
	Jungle ji = new Jungle();
        Characters rabbit = ji.createAnimal("Rabbit");
        rabbit.getSleepy();
        Characters tortoise = ji.createAnimal("Tortoise");

        ji.startRace(rabbit,tortoise);






    }
}
