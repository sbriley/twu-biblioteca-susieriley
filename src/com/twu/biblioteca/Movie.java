package com.twu.biblioteca;

public class Movie extends Media {

    int year;
    String director;
    int rating;

    public Movie(String title, int year, String director, int rating) {
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.mediaType = Media.MOVIE;
    }

    public String detailsString() {
        String s = "" +
                title + "\n" +
                "  released " + year + "\n" +
                "  directed by " + director + "\n";
        if (rating == 0) {
            s += "  no rating";
        } else {
            s += "  rating: " + rating + "/10";
        }
        return s;
    }
}
