package com.company;

public class Main {

    public static void main(String[] args) {

        CSGOPlayer avg = new AveragePlayer();
        avg.display();
        avg.Role();
        avg.Position();

        System.out.println(" - ");

        CSGOPlayer carry = new Carry();
        carry.display();
        carry.Role();
        carry.Position();

        System.out.println(" - ");

        CSGOPlayer exp = new ExperiencedPlayer();
        exp.display();
        exp.Role();
        exp.Position();

    }
}
