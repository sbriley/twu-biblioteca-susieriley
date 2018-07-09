package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {
    @Test
    public void testDetails() {
        Book book = new Book("Call Me By Your Name", "Andre Aciman", 2007);
        assertEquals(book.detailsString(),book.title + "\n" +
                "  by "+ book.author + "\n" +
                "  published " + book.year);
    }




}
