package com.company;

import java.util.List;

public class Player implements IObserver {

    String nickname;

    public Player(String nickname){
        this.nickname = nickname;
    }
    @Override
    public void update(List<String> objective) {

        System.out.println("\nPlayer " + nickname + "\nThe main objective of this match is updated!\n"+ "The actual objectives are: " + objective);

    }
}
