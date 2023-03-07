package com.example.conc;

import com.example.abst.Animal;

public class AnimalFactory {
    public static Animal createAnimal(String type)
    {
        if(type.equalsIgnoreCase("cat"))
        {

            return new Cat();
        } else if (type.equalsIgnoreCase("bird")) {
            return  new Bird();
        }else
        {
            throw new IllegalArgumentException("Invalid type "+type);
        }
    }
}
