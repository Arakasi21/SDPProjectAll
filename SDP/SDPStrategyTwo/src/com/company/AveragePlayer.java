package com.company;

public class AveragePlayer extends CSGOPlayer{

    public AveragePlayer() {
        rl = new Ancor();
        ps = new B_Site();
    }

    @Override
    public void display() {
        System.out.println("I am Average Player");
    }
}
