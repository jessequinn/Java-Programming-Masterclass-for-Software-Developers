package com.jessequinn;

public abstract class Bird extends Animal implements ICanFly {
    public Bird(String animalName) {
        super(animalName);
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " is pecking.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat.");
    }

//    public abstract void fly();

    @Override
    public void fly() {
        System.out.println(getAnimalName() + " is flapping its wings.");
    }
}
