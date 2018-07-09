package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleUI {
    static String greeting = "Welcome to the Bangalore Public Library!";

    //TODO maybe a menu class?
    public static String[] menuLabels = {"List Books","Checkout Book","Return Book","Quit"};

    // TODO fix library parameter? Where does the library go?
    public String startupMessage() {
        return greeting;
    }

    //TODO should this listBooks be in here?
    public String listBooks(Library lib) {
        return lib.listBooks();

    }

    public String response(String userInput, Library lib) {
        Scanner scanner = new Scanner(System.in);
        String title;
        switch (userInput) {
            case "List Books":
                return lib.listBooks();
            case "Return Book":
                System.out.println("What is the name of the book you would like to return?");
                title = scanner.nextLine();
                return lib.returnBook(title);
            case "Checkout Book":
                System.out.println("What is the name of the book you would like to checkout?");
                title = scanner.nextLine();
                return lib.checkoutBook(title);
        }
        return "Select a valid option!";
    }

    public void println(String string) {
        System.out.println(string);
    }

    public String println(String string, Boolean testing) {
//        System.out.println(string);
        return string;
    }

    //TODO I have all these functions returning strings - but only for testing purposes, is that ok?
    public String listOptions() {
        String s = "";
        for (String menuLabel : this.menuLabels) {
            s += menuLabel += "\n";
        }
        return s;

    }

    public void displayStartupMessage() {
        System.out.println(this.startupMessage());
    }

    public void respond(String userInput, Library lib) {
        System.out.println(this.response(userInput,lib));
    }
}
