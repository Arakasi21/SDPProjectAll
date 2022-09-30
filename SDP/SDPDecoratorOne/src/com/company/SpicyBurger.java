package com.company;

public class SpicyBurger  implements IBurfe{
    private IBurfe burger;

    public SpicyBurger(IBurfe burger){
        this.burger = burger;
    }

    @Override
    public double getCost() {
        return this.burger.getCost() + 1;
    }

    @Override
    public int getSize() {
        return this.burger.getSize();
    }

    @Override
    public String getType() {
        return "Острый";
    }
}
