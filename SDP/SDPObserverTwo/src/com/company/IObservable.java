package com.company;

public interface IObservable {
    public void addObserver(IObserver observer);
    public void deleteObserver(IObserver observer);
    public void notifyObservers();

}
