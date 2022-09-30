package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(" - - - - ");

        IArmy defarmy = new DefaultArmy();
        System.out.println("Тип армии: " +  String.valueOf(defarmy.getName()));
        System.out.println("Мощь армии: " + String.valueOf(defarmy.getPower()));
        System.out.println("Кол-во пехоты: " +  String.valueOf(defarmy.getNumberTroopers()));
        System.out.println("Кол-во танков: " +  String.valueOf(defarmy.getNumberTanks()));
        System.out.println("Кол-во артилерии: " +  String.valueOf(defarmy.getNumberArt()));

        System.out.println(" - - - - ");

        IArmy heavarmy = new HeavyArmoredArmy(defarmy);
        System.out.println("Тип армии: " +  String.valueOf(heavarmy.getName()));
        System.out.println("Мощь армии: " + String.valueOf(heavarmy.getPower()));
        System.out.println("Кол-во пехоты: " +  String.valueOf(heavarmy.getNumberTroopers()));
        System.out.println("Кол-во танков: " +  String.valueOf(heavarmy.getNumberTanks()));
        System.out.println("Кол-во артилерии: " +  String.valueOf(heavarmy.getNumberArt()));

        System.out.println(" - - - - ");

        IArmy artarmy = new ArtArmy(defarmy);
        System.out.println("Тип армии: " +  String.valueOf(artarmy.getName()));
        System.out.println("Мощь армии: " + String.valueOf(artarmy.getPower()));
        System.out.println("Кол-во пехоты: " +  String.valueOf(artarmy.getNumberTroopers()));
        System.out.println("Кол-во танков: " +  String.valueOf(artarmy.getNumberTanks()));
        System.out.println("Кол-во артилерии: " +  String.valueOf(artarmy.getNumberArt()));


    }
}
