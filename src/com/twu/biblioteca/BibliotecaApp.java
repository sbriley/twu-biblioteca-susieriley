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
        ui.displayStartupMessage();
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if (userInput.equals("Quit")) {
                break;
            } else {
                this.ui.respond(userInput,this.lib);
            }
        }
    }
}
