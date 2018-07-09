package com.twu.biblioteca;

public class Library {
    private Book[] books;

    public Library() {
        books = new Book[]{
                new Book("Call Me By Your Name", "Andre Aciman", 2007),
                new Book("A Tale for the Time Being","Ruth Ozeki",2013)};
    }

    public Book[] books() {
        return this.books;
    }

    public String listBooks() {
        String s = "";
        for (Book book : books) {
            s += book.detailsString() + "\n\n";
        }
        return s;
    }
}
