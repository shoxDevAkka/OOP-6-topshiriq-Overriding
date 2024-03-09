package com.Overriding.B;

public class MainDisplay {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();

        System.out.println("Kuchuk natijalari :");

        System.out.println("Ovozi : " + dog.sound());
        System.out.println("Nomi : " + dog.getName());

        System.out.println();
        System.out.println("Mushuk natijalari :");

        System.out.println("Ovozi : " + cat.sound());
        System.out.println("Nomi : " + cat.getName());

        System.out.println();
        System.out.println("O'rdak natijalari :");

        System.out.println("Ovozi : " + duck.sound());
        System.out.println("Nomi : " + duck.getName());
    }
}
