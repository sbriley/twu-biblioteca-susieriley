package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

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
        assertTrue(book.isAvailable());
        book.checkoutItem();
        assertTrue(book.isCheckedOut());
    }

    @Test
    public void returnTest() {
        Book book = new Book("Call Me By Your Name", "Andre Aciman", 2007);
        book.checkoutItem();
        assertTrue(book.isCheckedOut());
        book.returnItem();
        assertTrue(book.isAvailable());
    }


}
