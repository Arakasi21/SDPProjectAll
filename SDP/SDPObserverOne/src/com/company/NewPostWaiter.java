package com.company;

import java.util.List;

public class NewPostWaiter implements IObserver {

    String name;

    public NewPostWaiter(String name){
        this.name = name;
    }

    @Override
    public void update(List<String> newposts) {
        System.out.println("Внимание! Уважаемый " + name + "!" + "\nУ нас новые изменения в постах на сайте!\n"+ "Список актуальных постов: " + newposts + "\n ----- \n");
    }
}
