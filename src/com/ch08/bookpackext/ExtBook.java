package com.ch08.bookpackext;

import com.ch08.bookpack.Book;

public class ExtBook extends Book {
    private String publisher;

    public ExtBook(String title, String auther, int pubDate, String publisher) {
        super(title, auther, pubDate);
        this.publisher = publisher;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    }
}
