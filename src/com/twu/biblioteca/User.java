package com.twu.biblioteca;

import java.util.Objects;

public class User {
    int libraryCard;

    public User(int libraryCard) {
        this.libraryCard = libraryCard;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return libraryCard == user.libraryCard;
    }

}
