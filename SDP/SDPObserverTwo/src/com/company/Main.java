package com.company;

public class Main {

    public static void main(String[] args) {

        MatchMaker match = new MatchMaker();

        match.addObjective("You have to defend point A!");
        match.addObjective("The enemy capturing point C!");

        IObserver fplayerR = new Player("Arakasi");
        IObserver splayerR = new Player("MagicGreen");
        IObserver tplayerR = new Player("Jntbk");

        MatchMaker matchB = new MatchMaker();

        matchB.addObjective("You have to attack point A!");
        matchB.addObjective("Your team capturing point C!");

        IObserver fplayerB = new Player("Khan");
        IObserver splayerB = new Player("Yastreb");
        IObserver tplayerB = new Player("casse");

        match.addObserver(fplayerR);
        match.addObserver(splayerR);
        match.addObserver(tplayerR);

        matchB.addObserver(fplayerB);
        matchB.addObserver(splayerB);
        matchB.addObserver(tplayerB);

        matchB.removeObjective("You have to attack point A!");

        match.removeObjective("You have to defend point A!");

        match.addObjective("You has lost point B");

        match.removeObjective("The enemy capturing point C!");
        match.removeObjective("You has lost point B");

    }
}
