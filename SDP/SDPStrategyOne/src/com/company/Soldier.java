package com.company;

public abstract class Soldier {
    MainWeapon mw;
    MovementBehavior mb;

    public void setMw(MainWeapon mw) {
        this.mw = mw;
    }

    public void setMb(MovementBehavior mb) {
        this.mb = mb;
    }

    public abstract void display();

    public void mainWeapon() {mw.weapon();};
    public void performMove() {mb.move();};
}
