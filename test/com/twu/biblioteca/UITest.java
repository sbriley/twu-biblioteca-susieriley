package com.twu.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

// not sure how to test functions that require user input

public class UITest {

    private static final Boolean TEST = true;
//    String[] menuOptions = {"List Books","Help"};

    @Test
    public void testListBooks() {
        ConsoleUI ui = new ConsoleUI();
        Library lib = new Library(new Book[]{
                new Book("Call Me By Your Name", "Andre Aciman", 2007),
                new Book("A Tale for the Time Being","Ruth Ozeki",2013)});


        // these tests are problematic to me, because if i add another book then the test will fail. But if I generalize the right side of the test, then I'll have duplicated code
        assertEquals(lib.listBooks(), "Call Me By Your Name\n" +
                "  by Andre Aciman\n" +
                "  published 2007\n" +
                "A Tale for the Time Being\n" +
                "  by Ruth Ozeki\n" +
                "  published 2013\n");
    }

    @Test
    public void testListBooksResponse() {
        ConsoleUI ui = new ConsoleUI();
        Library lib = new Library();
        String response = ui.response("List Books",lib);
        assertEquals(ConsoleUI.println(response,TEST),lib.listBooks());
    }

    // is this test useful? it basically repeats the code in ui.menuOptions() - but how else do you test things
    // that just print?
    @Test
    public void testDisplayOptions() {
        ConsoleUI ui = new ConsoleUI();
        String result = "";
        for (String menuLabel : ConsoleUI.menuLabels) {
            result += menuLabel+ "\n";
        }
        assertEquals(ui.println(ui.menuOptions(),TEST),result);
    }

    @Test
    public void testInvalidOptionCase() {
        ConsoleUI ui = new ConsoleUI();
        Library lib = new Library();
        assertEquals(ui.response("Books",lib),ConsoleUI.INVALID_OPTION);
    }

}
