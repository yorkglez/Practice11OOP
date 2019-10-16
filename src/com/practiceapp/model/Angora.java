package com.practiceapp.model;

public class Angora extends Cat
{
    private double mouthLong;
    //Constructos
    public Angora(){}

    public  Angora(int id, String name, int age)
    {
        super(id,name,age);
    }

    //Getters and setters
    public double getMouthLong()
    {
        return mouthLong;
    }

    public void setMouthLong(double mouthLong){
        this.mouthLong = mouthLong;
    }

    //ToString method specific to Angora Class
    @Override
    public String ToString(){
        return "Id:["+id+"], name:["+name+"], age:["+age+"], mouthLongitude:["+mouthLong+"]" ;
    }
}
