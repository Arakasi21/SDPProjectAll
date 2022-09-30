package com.company;

public class DefaultArmy implements IArmy{

    private String armytype = "Regular Army";
    private double power = 50.0;
    private int troopers = 2000;
    private int tanks = 20;
    private int art = 20;


    public String getName() {
        return this.armytype;
    }

    public double getPower() {
        return this.power;
    }

    public int getNumberTroopers() {
        return this.troopers;
    }

    public int getNumberTanks() {
        return this.tanks;
    }

    public int getNumberArt() {
        return this.art;
    }
}
