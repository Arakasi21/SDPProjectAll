package com.company;

public class Carry extends CSGOPlayer{

    public Carry() {
        rl = new Sniper();
        ps = new Middle();
    }

    @Override
    public void display() {
        System.out.println("I am Carry");
    }
}
