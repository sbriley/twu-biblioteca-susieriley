package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    @Test
    public void testCheckoutBook() {
        Library lib = new Library();
        assertEquals(lib.checkoutItem("Call Me By Your Name"),"Thank you! Enjoy the book");
        assertEquals(lib.checkoutItem("Call Me By Your Name"),"That book is not available.");
    }

    @Test
    public void testReturnBook() {
        Library lib = new Library();
        lib.checkoutItem("Call Me By Your Name");
        assertEquals(lib.returnItem("Call Me By Your Name"),"Thank you for returning the book.");
        assertEquals(lib.returnItem("The Bell Jar"),"That is not a valid book to return.");
    }
}
