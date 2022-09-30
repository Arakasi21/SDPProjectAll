package com.company;

public class Main {

    public static void main(String[] args) {

        IBurfe Burger = new Burger();
        System.out.println("Цена бургера: " + String.valueOf(Burger.getCost()) + "$" );
        System.out.println("Размер бургера " + String.valueOf(Burger.getSize()) + " размера");
        System.out.println("Тип Бургера: " + String.valueOf(Burger.getType()));

        System.out.println(" - ");

        IBurfe KingBurger = new KingBurger(Burger);

        System.out.println("Цена Кинг Бургера: " + String.valueOf(KingBurger.getCost()) + "$" );
        System.out.println("Размер Кинг бургера " + String.valueOf(KingBurger.getSize()) + " размера");
        System.out.println("Тип Кинг Бургера: " + String.valueOf(KingBurger.getType()));

        System.out.println(" - ");

        IBurfe SpicyBurger = new SpicyBurger(Burger);
        System.out.println("Цена Острого Бургера: " + String.valueOf(SpicyBurger.getCost()) + "$" );
        System.out.println("Размер Острого бургера " + String.valueOf(SpicyBurger.getSize()) + " размера");
        System.out.println("Тип Острого Бургера: " + String.valueOf(SpicyBurger.getType()));

    }
}