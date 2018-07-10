package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MediaTest {
    @Test
    public void testCheckoutMedia() {
        Book book = new Book("Call Me By Your Name", "Andre Aciman", 2007);
        Movie movie = new Movie("Cars", 2006,"John Lasseter",7);
        User user = new User(1234567);
        assertEquals(book.checkoutItem(user),"Thank you! Enjoy the book");
        assertEquals(movie.checkoutItem(user),"Thank you! Enjoy the movie");
    }

    @Test
    public void returnTest() {
        Media movie = new Movie("Call Me By Your Name",2017,"Luca Guadagnino",8);
        User user = new User(1234567);
        movie.checkoutItem(user);
        assertTrue(movie.isCheckedOut());
        movie.returnItem(user);
        assertTrue(movie.isAvailable());
    }

}
