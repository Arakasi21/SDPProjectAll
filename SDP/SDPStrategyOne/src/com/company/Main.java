package com.company;

public class Main {

    public static void main(String[] args) {
        Soldier machinegunner = new MachineGunner();
        machinegunner.display();
        machinegunner.mainWeapon();
        machinegunner.performMove();

        System.out.println(" - ");

        Soldier sniper = new Sniper();
        sniper.display();
        sniper.mainWeapon();
        sniper.performMove();
    }
}
