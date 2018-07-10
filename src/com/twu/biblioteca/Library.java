package com.twu.biblioteca;

public class Library {
    private Media[] items;

    public Library() {
        this.items = new Media[]{
                new Book("Call Me By Your Name", "Andre Aciman", 2007),
                new Book("A Tale for the Time Being","Ruth Ozeki",2013),
                new Book("Happiness: A Very Short Introduction","Daniel M. Haybron",2013),
                new Book("Catch-22","Joseph Heller",1961),
                new Movie("Cars",2006,"John Lasseter",7)
        };
    }

    public Library(Media[] items) {
        this.items = items;
    }

    public String mediaList() {
        String s = "";
        for (Media item : items) {
            if(item.isAvailable()) {
                s += item.detailsString() + "\n";
            }
        }
        return s;
    }

    public String checkoutItem(String title, User user) {
        for (Media item : items) {
            if(item.getTitle().equals(title) && item.isAvailable()) {
                return item.checkoutItem(user);
            }
        }
        return "That book is not available.";
    }

    public String returnItem(String title, User user) {
        for (Media item : items) {
            if (item.getTitle().equals(title) && item.getUser().equals(user)) {
                item.returnItem(user);
                return "Thank you for returning the book.";
            }
        }
        return "That is not a valid book to return.";
    }

    public User getUserOfItem(String title) {
        for (Media item : items) {
            if (item.getTitle().equals(title) && item.isCheckedOut()) {
                return item.getUser();
            }
        }
        return new NullUser();
    }
}
