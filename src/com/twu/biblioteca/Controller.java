package com.twu.biblioteca;

public class Controller {

    private BookList bookList = new BookList();

    public boolean checkoutBook(String title) {
        for(Book book : bookList.getUncheckedOutBooks()){
            if(book.getTitle().equals(title)){
                book.setCheckedOut(true);
                return true;
            }
        }
        return false;
    }
}
