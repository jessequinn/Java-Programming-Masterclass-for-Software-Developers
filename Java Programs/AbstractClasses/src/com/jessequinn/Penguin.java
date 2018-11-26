package com.jessequinn;

public class Penguin extends Bird {
    public Penguin(String animalName) {
        super(animalName);
    }

    @Override
    public void fly() {
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
