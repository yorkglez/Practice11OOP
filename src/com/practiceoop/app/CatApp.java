package com.practiceoop.app;

import com.practiceapp.model.Angora;
import com.practiceapp.model.Cat;
import com.practiceapp.model.Persa;

public class CatApp
{
    public static void main(String[] args)
    {
        Cat michi = new Cat();

        michi.setId(1);
        michi.setName("Michi");
        michi.setAge(3);

        /*System.out.println(String.format("Michi's id: %d \nMichi's name: %f \nMichi's age: %d",
                michi.getId(),michi.getName(),michi.getAge()));*/
        System.out.println(michi.ToString());

        Angora tom = new Angora(2,"Tom",4);
        System.out.println(tom.ToString());
        //Persa = new Persa();
    }
}
