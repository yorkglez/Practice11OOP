package com.practiceapp.model;

public class Dog
{
    //Attributes declaration
    public int id;
    private String name;
    protected String breed;
    public int age;
    public double height;

    //Construct declaration
    public Dog(int id, String name, String breed, int age, double height)
    {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.height = height;
    }

    //
    public Dog(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    //Construct empty declaration
    public Dog(){}
}

