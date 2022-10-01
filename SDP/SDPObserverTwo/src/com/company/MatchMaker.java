package com.company;

import java.util.ArrayList;
import java.util.List;

public class MatchMaker implements IObservable{

    List<String> objectives = new ArrayList<>();

    List<IObserver> players = new ArrayList<>();

    public void addObjective (String objective) {
        this.objectives.add(objective);
        notifyObservers();

    }

    public void removeObjective(String objective){
        this.objectives.remove(objective);
        notifyObservers();
    }


    @Override
    public void addObserver(IObserver observer) {
        this.players.add(observer);
    }

    @Override
    public void deleteObserver(IObserver observer) {
        this.players.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : players){
            observer.update(this.objectives);
        }
    }
}
