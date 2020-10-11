package com.ch08.bookpackext;

import com.ch08.bookpack.Book;

public class UseBook {
    public static void main(String[] args) {
        Book books[] = new Book[5];
        books[0] = new Book("Java: A Beginner's Guide", "schildt", 2019);
        books[1] = new Book("Java: The Complete Reference", "schildt", 2019);
        books[2] = new Book("Introduction JavaFx 8 Programming", "schildt", 2015);
        books[3] = new Book("Red Storm Rising", "Clancy", 1986);
        books[4] = new Book("On the Road", "Kerouac", 1955);
        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
