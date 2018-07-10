package com.twu.biblioteca;

import java.util.Arrays;

class Book extends Media {

    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.mediaType = Media.BOOK;
    }

    public String detailsString() {
        return "" +
                title + "\n" +
                "  by "+ author + "\n" +
                "  published " + year;
    }


}
