package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    public static List<Book> books = new ArrayList<Book>();

    static{
        books.add(new Book("Book1", "Author1",2014));
        books.add(new Book("Book2", "Author2",2015));
        books.add(new Book("Book3", "Author3",2016));
        books.add(new Book("Book4", "Author4",2017));
        books.add(new Book("Book5", "Author5",2018));
    }

    public List<Book> getBooks(){
        return books;
    }

    public List<Book> getBookList(boolean isCheckedOut) {
        List<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            if(book.isCheckedOut() == isCheckedOut){
                result.add(book);
            }
        }
        return result;
    }
}
