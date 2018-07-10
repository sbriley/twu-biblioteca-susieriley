package com.twu.biblioteca;

public abstract class Media {

    public static final String MOVIE = "movie";
    public static final String BOOK = "book";

    protected String title;
    protected String mediaType;
    protected User user;

    abstract String detailsString();

    public Media() {
        this.user = new NullUser();
    }

    public User getUser() {
        return user;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isAvailable() {
        return user.equals(new NullUser());
    }

    public boolean isCheckedOut() {
        return !user.equals(new NullUser());
    }

    public String checkoutItem(User user) {
        if (this.isAvailable()) {
            this.user = user;
        }
        return "Thank you! Enjoy the " + mediaType;
    }

    public void returnItem(User user) {
        if (this.isCheckedOut()) {
            this.user = new NullUser();
        }
    }
}
