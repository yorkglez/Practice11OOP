package com.practiceapp.model;

public class Cat
{
    //
    private int id;
    private String name;
    private int age;

    //Construct empty
    public Cat(){

    }

    //Construct
    public Cat(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Getters and setters
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    //ToSring method
    public String ToString(){
        return "Id:["+id+"], name:["+name+"], age:["+age+"]";
    }

}
