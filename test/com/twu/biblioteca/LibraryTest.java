package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    @Test
    public void testCheckoutBook() {
        Library lib = new Library();
        User user = new User(1234567);
        assertEquals(lib.checkoutItem("Call Me By Your Name",user),Response.validCheckout(Media.BOOK));
        assertEquals(lib.getUserOfItem("Call Me By Your Name"),user);
        assertEquals(lib.checkoutItem("Call Me By Your Name", user),Response.invalidCheckout(Media.BOOK));
    }

    @Test
    public void testReturnBook() {
        Library lib = new Library();
        User user = new User(1234567);
        lib.checkoutItem("Call Me By Your Name", user);
        assertEquals(lib.returnItem("Call Me By Your Name", user),Response.validReturn(Media.BOOK));
        assertEquals(lib.returnItem("The Bell Jar", user),Response.invalidReturn(Media.BOOK));
    }

    @Test
    public void testCheckoutMovie() {
        Library lib = new Library();
        User user = new User(1234567);
        assertEquals(lib.checkoutItem("Cars", user),Response.validCheckout(Media.MOVIE));
    }

    @Test
    public void testTwoUsers() {
        Library lib = new Library();
        User user1 = new User(1234567);
        User user2 = new User(2345678);
        lib.checkoutItem("Call Me By Your Name",user1);
        assertEquals(lib.returnItem("Call Me By Your Name",user2),Response.invalidReturn(Media.BOOK));
        assertEquals(lib.checkoutItem("Call Me By Your Name",user2),Response.invalidCheckout(Media.BOOK));
        assertEquals(lib.returnItem("Call Me By Your Name",user1),Response.validReturn(Media.BOOK));
        assertEquals(lib.checkoutItem("Call Me By Your Name",user2),Response.validCheckout(Media.BOOK));
    }
}
