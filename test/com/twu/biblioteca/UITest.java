package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UITest {

    private static final Boolean TEST = true;
//    String[] menuOptions = {"List Books","Help"};

    @Test
    public void testStartupMessage() {
        ConsoleUI ui = new ConsoleUI();
        Library lib = new Library();

        //TODO remove duplication but how?
        assertEquals(ui.startupMessage(),"Welcome to the Bangalore Public Library!");
    }

    @Test
    public void testListBooks() {
        ConsoleUI ui = new ConsoleUI();
        Library lib = new Library(new Book[]{
                new Book("Call Me By Your Name", "Andre Aciman", 2007),
                new Book("A Tale for the Time Being","Ruth Ozeki",2013)});


        //TODO: these tests are problematic to me, because if i add another book then the test will fail. But if I generalize the right side of the test, then I'll have duplicated code
        assertEquals(lib.listBooks(), "Call Me By Your Name\n" +
                "  by Andre Aciman\n" +
                "  published 2007\n\n" +
                "A Tale for the Time Being\n" +
                "  by Ruth Ozeki\n" +
                "  published 2013\n\n");
    }

    @Test
    public void testInvalidResponse() {
        ConsoleUI ui = new ConsoleUI();
        Library lib = new Library();
        assertEquals(ui.response("some Invalid Menu Item",lib),"Select a valid option!");
    }

    @Test
    public void testListBooksResponse() {
        ConsoleUI ui = new ConsoleUI();
        Library lib = new Library();
        String response = ui.response("List Books",lib);
        assertEquals(ui.println(response,TEST),ui.listBooks(lib));
    }

    // I realize this test is bad because if I were to add a new menu option it would not pass
    @Test
    public void testDisplayOptions() {
        ConsoleUI ui = new ConsoleUI();
        String result = "";
        for (String menuLabel : ConsoleUI.menuLabels) {
            result += menuLabel+ "\n";
        }
        assertEquals(ui.println(ui.listOptions(),TEST),result);
    }

}
