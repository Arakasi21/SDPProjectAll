package com.company;

public class MachineGunner extends Soldier{
    public MachineGunner() {
        mw = new MachineGun();
        mb = new MoveByFoot();
    }

    @Override
    public void display() {
        System.out.println("I am MachineGunner");
    }
}
