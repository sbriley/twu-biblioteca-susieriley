package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MovieTest {


    @Test
    public void checkoutTest() {
        Movie movie = new Movie("Call Me By Your Name",2017,"Luca Guadagnino",8);
        assertTrue(movie.isAvailable());
        movie.checkoutItem();
        assertTrue(movie.isCheckedOut());
    }

    @Test
    public void returnTest() {
        Movie movie = new Movie("Call Me By Your Name",2017,"Luca Guadagnino",8);
        movie.checkoutItem();
        assertTrue(movie.isCheckedOut());
        movie.returnItem();
        assertTrue(movie.isAvailable());
    }

}
