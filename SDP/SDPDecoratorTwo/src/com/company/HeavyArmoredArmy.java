package com.company;

public class HeavyArmoredArmy implements IArmy{
    private IArmy army;

    public HeavyArmoredArmy(IArmy army){this.army = army;}

    @Override
    public String getName() {
        return "Heavy Armored Army";
    }

    @Override
    public double getPower() {
        return this.army.getPower() + 20;
    }

    @Override
    public int getNumberTroopers() {
        return this.army.getNumberTroopers() - 200;
    }

    @Override
    public int getNumberTanks() {
        return this.army.getNumberTanks() + 40;
    }

    @Override
    public int getNumberArt() {
        return this.army.getNumberArt() - 10;
    }
}
