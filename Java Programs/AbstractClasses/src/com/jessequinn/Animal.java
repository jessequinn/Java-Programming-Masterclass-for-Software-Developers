package com.jessequinn;

public abstract class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getAnimalName() {
        return animalName;
    }
}