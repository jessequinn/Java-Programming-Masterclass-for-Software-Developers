package com.jessequinn;

public class Dog extends Animal {
    public Dog(String animalName) {
        super(animalName);
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " is eating.");

    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat.");
    }
}