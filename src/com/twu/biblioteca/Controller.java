package com.twu.biblioteca;

public class Controller {

    private BookList bookList = new BookList();

    public boolean checkoutBook(String title) {
        for(Book book : bookList.getBookList(false)){
            if(book.getTitle().equals(title)){
                book.setCheckedOut(true);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String title) {
        for(Book book : bookList.getBookList(true)){
            if(book.isCheckedOut() && book.getTitle().equals(title)){
                book.setCheckedOut(false);
                return true;
            }
        }
        return false;
    }
}
