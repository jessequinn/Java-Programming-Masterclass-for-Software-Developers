package com.jessequinn;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Shitzu");
        dog.breathe();
        dog.eat();

//        Bird bird = new Bird("Parrot");
//        bird.breathe();
//        bird.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
