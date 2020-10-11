package com.ch08.bookpack;

public class Book {
    protected String title;
    protected String auther;



    protected int pubDate;

    public Book(String title, String auther, int pubDate) {

        this.title = title;
        this.auther = auther;
        this.pubDate = pubDate;
    }

    public void show() {
        System.out.println(title);
        System.out.println(auther);
        System.out.println(pubDate);
        System.out.println();
    }

}
