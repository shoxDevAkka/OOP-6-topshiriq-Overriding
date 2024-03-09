package com.Overriding.B;

public class Dog extends Animal {

    private String soundDog = "bow-bow";
    private String name = "Dog";

    public void setSoundDog(String soundDog) {
        this.soundDog = soundDog;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String sound(){
        return soundDog;
    }

    @Override
    public String getName(){
        return name;
    }
}
