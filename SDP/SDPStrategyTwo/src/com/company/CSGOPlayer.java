package com.company;

public abstract class CSGOPlayer {
    Role rl;
    Position ps;

    public void setRole(Role rl) {
        this.rl = rl;
    }

    public void setPos(Position ps) {
        this.ps = ps;
    }

    public abstract void display();

    public void Role() {rl.role();};
    public void Position() {ps.pos();};
    }
