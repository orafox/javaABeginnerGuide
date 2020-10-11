package com.ch08;

public class Book {
    private String title;
    private String auther;
    private  int pubDate;

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
