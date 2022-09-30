package com.company;

public class ExperiencedPlayer extends CSGOPlayer{

    public ExperiencedPlayer() {
        rl = new Captain();
        ps = new A_site();
    }

    @Override
    public void display() {
        System.out.println("I am Experienced Player ");
    }
}
