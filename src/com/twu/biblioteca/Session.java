package com.twu.biblioteca;

public class Session {
    public User user;
    public Library lib;
    public ConsoleUI ui;

    public static User[] possibleUsers = {new User(1234567), new User(2345678)};

    public void launch() {
        while(user.equals(new NullUser())) {
            User user = ui.userCredentials();
            this.loginUser(user);
        }
    }

    enum UserOption {
        MEDIA_LIST
    }

    public Session() {
        this.lib = new Library();
        this.user = new NullUser();
        this.ui = new ConsoleUI();
    }

    public void loginUser(User user) {
        this.user = user;
    }

    public String responseToInput(UserOption userOption) {
        switch (userOption) {
            case MEDIA_LIST:
                return lib.mediaList();
        }
        return Response.INVALID_MENU_OPTION;
    }
}
