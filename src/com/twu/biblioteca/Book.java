package com.twu.biblioteca;

class Book {
    String title;
    String author;
    int year;

    public String detailsString() {
        return "" +
                title + "\n" +
                "  by "+ author + "\n" +
                "  published " + year;
    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
