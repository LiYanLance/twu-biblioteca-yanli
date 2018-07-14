package com.twu.biblioteca;

public class Book extends Item{


    private String author;

    public Book(String title, String author, int year) {
        super(title, year, Type.BOOK);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
