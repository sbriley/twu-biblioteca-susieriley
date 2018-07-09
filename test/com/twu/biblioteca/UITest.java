package com.twu.biblioteca;

import org.junit.Test;

import java.io.Console;

import static junit.framework.TestCase.assertEquals;

public class UITest {
    @Test
    public void testStartupMessage() {
        ConsoleUI ui = new ConsoleUI(System.out);
        Library lib = new Library();

        //TODO remove duplication but how?
        assertEquals(ui.startupMessage(lib),"Welcome to the Bangalore Public Library!");
    }

    @Test
    public void testListBooks() {
        ConsoleUI ui = new ConsoleUI(System.out);
        Library lib = new Library();
        assertEquals(lib.listBooks(), "Call Me By Your Name\n" +
                "  by Andre Aciman\n" +
                "  published 2007\n\n" +
                "A Tale for the Time Being\n" +
                "  by Ruth Ozeki\n" +
                "  published 2013\n\n");
    }

    @Test
    public void testInvalidResponse() {
        ConsoleUI ui = new ConsoleUI(System.out);
        Library lib = new Library();
        assertEquals(ui.respond("some Invalid Menu Item",lib),"Select a valid option!");
    }

    @Test
    public void testListBooksResponse() {
        ConsoleUI ui = new ConsoleUI(System.out);
        Library lib = new Library();
        assertEquals(ui.respond("List Books",lib),ui.listBooks(lib));
    }


    public void testOutputStream() {
        StringStream stringStream = new StringStream();
        ConsoleUI ui = new ConsoleUI(stringStream);
        assertEquals(ui.println("hello"),"hello");


    }

}
