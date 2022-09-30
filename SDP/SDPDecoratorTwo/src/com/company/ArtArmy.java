package com.company;

public class ArtArmy implements IArmy{
    private IArmy army;

    public ArtArmy(IArmy army){this.army = army;}

    @Override
    public String getName() {
        return "Artillery Armored Army";
    }

    @Override
    public double getPower() {
        return this.army.getPower() + 30;
    }

    @Override
    public int getNumberTroopers() {
        return this.army.getNumberTroopers() - 500;
    }

    @Override
    public int getNumberTanks() {
        return this.army.getNumberTanks() - 10;
    }

    @Override
    public int getNumberArt() {
        return this.army.getNumberArt() + 20;
    }
}
