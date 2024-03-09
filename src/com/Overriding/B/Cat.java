package com.Overriding.B;

public class Cat extends Animal {

    private String soundCat = "meow-meow";
    private String name = "Cat";

    public void setSoundCat(String soundCat) {
        this.soundCat = soundCat;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String sound() {
        return soundCat;
    }

    @Override
    public String getName() {
        return name;
    }
}
