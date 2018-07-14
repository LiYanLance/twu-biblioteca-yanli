package com.twu.biblioteca;

public class Movie extends Item{

    private String director;
    private int rating;

    public Movie(String title, String director, int year, int rating) {
        super(title, year, Type.MOVIE);
        this.director = director;
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
