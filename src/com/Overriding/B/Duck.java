package com.Overriding.B;

public class Duck extends Animal {

    private String soundDuck = "quack-quack";
    private String name = "Duck";

    public void setSoundDuck(String soundDuck) {
        this.soundDuck = soundDuck;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String sound(){
        return soundDuck;
    }

    @Override
    public String getName(){
        return name;
    }
}
