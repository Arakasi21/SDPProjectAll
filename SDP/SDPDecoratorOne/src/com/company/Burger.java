package com.company;

public class Burger implements IBurfe{

    private Double price = 12.5;
    private int size = 4;
    private String type = "Не острый";

    public double getCost() {return this.price;}

    public int getSize() {return this.size;}

    public String getType() {return this.type;}
}
