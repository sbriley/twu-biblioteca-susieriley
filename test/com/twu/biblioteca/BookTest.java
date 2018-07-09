package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class BookTest {
    @Test
    public void testDetails() {
        Book book = new Book("Call Me By Your Name", "Andre Aciman", 2007);
        assertEquals(book.detailsString(), book.title + "\n" +
                "  by " + book.author + "\n" +
                "  published " + book.year);
    }

    @Test
    public void checkoutTest() {
        Book book = new Book("Call Me By Your Name", "Andre Aciman", 2007);
        assertEquals(book.status(), Book.Status.AVAILABLE);
        book.checkoutBook();
        assertEquals(book.status(), Book.Status.CHECKED_OUT);
    }

    @Test
    public void returnTest() {
        Book book = new Book("Call Me By Your Name", "Andre Aciman", 2007);
        book.checkoutBook();
        book.returnBook();
        assertEquals(book.status(), Book.Status.AVAILABLE);
    }


}
