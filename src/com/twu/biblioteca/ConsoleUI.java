package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleUI {
    String greeting = "Welcome to the Bangalore Public Library!";

    public ConsoleUI(PrintStream stream) {
        PrintStream out = stream;
    }

    // TODO fix library parameter? Where does the library go?
    public String startupMessage(Library lib) {
        System.out.println(greeting);
        return greeting;
    }

    //TODO should this listBooks be in here?
    public String listBooks(Library lib) {
        return lib.listBooks();

    }

    public String respond(String userInput, Library lib) {
        if(userInput == "List Books") {
            return lib.listBooks();
        }
        return "Select a valid option!";
    }

    public String println(String string) {
        return "hello";
    }
}
