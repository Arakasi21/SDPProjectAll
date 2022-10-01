package com.company;

import java.util.ArrayList;
import java.util.List;

public class PostSite implements IObservable {
    List<String> newposts = new ArrayList<>();

    List<IObserver> postwaiters = new ArrayList<>();

    public void addPost (String newpost) {
        this.newposts.add(newpost);
        notifyObservers();

    }

    public void removePost(String newpost){
        this.newposts.remove(newpost);
        notifyObservers();
    }
    @Override
    public void registerObserver(IObserver o) {
        this.postwaiters.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        this.postwaiters.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : postwaiters){
            o.update(this.newposts);
        }
    }
}
