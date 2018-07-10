package com.twu.biblioteca;

import java.util.Arrays;

class Book {

    public enum Status {
        CHECKED_OUT, AVAILABLE
    }

    String title;
    String author;
    Status status;
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
        this.status = Status.AVAILABLE;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public void checkoutBook() {
        if(this.status.equals(Status.AVAILABLE)) {
            this.status = Status.CHECKED_OUT;
        }
    }

    public void returnBook() {
        if(this.status.equals(Status.CHECKED_OUT)) {
            this.status = Status.AVAILABLE;
        }
    }

    public Status status() {
        return this.status;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return status.equals(Status.AVAILABLE);
    }

    public boolean isCheckedOut() {
        return status.equals(Status.CHECKED_OUT);
    }
}
