package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome!");

        System.out.println();
        StringBuilder stringBuilder = new StringBuilder();
        List<Book> books = new BookList().getBooks();
        stringBuilder.append("Title\t").append("Author\t").append("Year Published\t\n");
        for(Book book : books){
            stringBuilder.append(book.getTitle() + "\t")
                    .append(book.getAuthor() + "\t")
                    .append(book.getPublishedYear() + "\t\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
