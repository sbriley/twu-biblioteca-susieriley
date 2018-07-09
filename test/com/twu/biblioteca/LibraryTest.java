package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Book[] testBooks = new Book[]{
            new Book("Call Me By Your Name", "Andre Aciman", 2007),
            new Book("A Tale for the Time Being","Ruth Ozeki",2013),
            new Book("Happiness: A Very Short Introduction","Daniel M. Haybron",2013),
            new Book("Catch-22","Joseph Heller",1961)
    };

    @Test
    public void testCheckoutBook() {
        Library lib = new Library(testBooks);
        assertEquals(lib.checkoutBook("Call Me By Your Name"),"Thank you! Enjoy the book");
        assertEquals(lib.checkoutBook("Call Me By Your Name"),"That book is not available.");
    }

    @Test
    public void testReturnBook() {
        Library lib = new Library(testBooks);
        lib.checkoutBook("Call Me By Your Name");
        assertEquals(lib.returnBook("Call Me By Your Name"),"Thank you for returning the book.");
        assertEquals(lib.returnBook("The Bell Jar"),"That is not a valid book to return.");
    }
}
