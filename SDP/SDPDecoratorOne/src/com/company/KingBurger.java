package com.company;

public class KingBurger implements IBurfe {
    private IBurfe burger;

    public KingBurger(IBurfe burger){
        this.burger = burger;
    }

    @Override
    public double getCost() {
        return this.burger.getCost() + 3;
    }

    @Override
    public int getSize() {
        return this.burger.getSize() + 2;
    }

    @Override
    public String getType() {
        return this.burger.getType();
    }
}
