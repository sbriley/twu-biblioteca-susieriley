package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    ConsoleUI ui;
    Library lib;

    public BibliotecaApp() {
        this.ui = new ConsoleUI();
        this.lib = new Library();
    }

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp();
        app.runApplication();
    }

    // I don't know how to test this!!!
    public void runApplication() {
        Scanner scanner = new Scanner(System.in);
        ui.displayStartupMessage();

        while(true) {
            String userInput = scanner.next();
            if (userInput.equals("Quit")) {
                break;
            } else {
                this.ui.respond(userInput,this.lib);
            }
        }

    }
}
