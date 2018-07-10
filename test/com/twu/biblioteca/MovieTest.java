package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MovieTest {
    @Test
    public void testDetails() {
        Movie movie = new Movie("Call Me By Your Name",2017, "Luca Guadagnino", 8);
        assertEquals(movie.detailsString(), movie.title + "\n" +
                "  released " + movie.year + "\n" +
                "  directed by " + movie.director + "\n" +
                "  rating: " + movie.rating + "/10");
    }

}
