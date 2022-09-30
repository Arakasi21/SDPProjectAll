package com.company;

public class Sniper extends Soldier{
    public Sniper() {
        mw = new SniperRifle();
        mb = new MoveByFoot();
    }

    @Override
    public void display() {
        System.out.println("I am Sniper");
    }
}
