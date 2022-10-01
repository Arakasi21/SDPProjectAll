package com.company;

public class Main { //Мой первый тестовый обсервер, где пользователи будут просто получать нотификации о новых постах

    public static void main(String[] args) {

            PostSite postSite = new PostSite();

            postSite.addPost("Post number one");
            postSite.addPost("Post number two");

            IObserver firstpostwaiter = new NewPostWaiter("Arsen Omarbekov");
            IObserver secondpostwaiter = new NewPostWaiter("Azamat Abdurakhmanov");

            postSite.registerObserver(firstpostwaiter);
            postSite.registerObserver(secondpostwaiter);

            postSite.addPost("Post number three");

            postSite.removePost("Post number one");

            postSite.removePost("Post number two");

    }

}
