package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleUI {
    static String greeting = "Welcome to the Bangalore Public Library!";

    public static String[] menuLabels = {"List Books","Checkout Book","Return Book","Quit"};
    public static String INVALID_OPTION = "Select a valid option!";

    public String startupMessage() {
        String message = greeting + "\n\n";
        message += "Please enter one of the following options: \n";
        message += menuOptions();
        return message;
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
        return INVALID_OPTION;
    }

    public static String println(String string, Boolean testing) {
        return string;
    }

    //TODO I have all these functions returning strings - but only for testing purposes, is that ok?
    public String menuOptions() {
        String s = "";
        for (String menuLabel : this.menuLabels) {
            s += menuLabel + "\n";
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
