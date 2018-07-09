package com.twu.biblioteca;

public class Library {
    private Book[] books;


    public Library() {
        books = new Book[]{
                new Book("Call Me By Your Name", "Andre Aciman", 2007),
                new Book("A Tale for the Time Being","Ruth Ozeki",2013)};
    }

    // This pretty much exists only for testing - is that okay?
    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return this.books;
    }

    public String listBooks() {
        String s = "";
        for (Book book : books) {
            s += book.detailsString() + "\n\n";
        }
        return s;
    }


    public String checkoutBook(String title) {
        for (Book book : books) {
            if(book.getTitle().equals(title) && book.isAvailable()) {
                book.checkoutBook();
                return "Thank you! Enjoy the book";
            }
        }
        return "That book is not available.";
    }

    public String returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isCheckedOut()) {
                book.returnBook();
                return "Thank you for returning the book.";
            }
        }
        return "That is not a valid book to return.";
    }
}
