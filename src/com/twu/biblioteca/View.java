package com.twu.biblioteca;

import java.util.List;

public class View {


    public void printMenu(){
        String menu = "1. List Books \n" +
                "2. Checkout Book \n" +
                "3. Return Book\n" +
                "4. Quit \n";
        System.out.println(menu);
    }


    public void showBookList(boolean isCheckedOut){
        StringBuilder stringBuilder = new StringBuilder();
        BookList bookList = new BookList();
        List<Book> books = isCheckedOut ? bookList.getBookList(isCheckedOut) : bookList.getBookList(isCheckedOut);
        stringBuilder.append("Title\t").append("Author\t").append("Year Published\t\n");
        for(Book book : books){
            stringBuilder.append(book.getTitle() + "\t")
                    .append(book.getAuthor() + "\t")
                    .append(book.getPublishedYear() + "\t\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
