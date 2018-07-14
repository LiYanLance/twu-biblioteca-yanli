package com.twu.biblioteca;

import java.util.List;

public class View {


    public void printMenu(){
        String menu = "1. List Books\n";
        System.out.println(menu);
    }


    public void showBookList(){
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
