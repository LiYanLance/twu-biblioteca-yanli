package com.twu.biblioteca;

public class Controller {

    private BookList bookList = new BookList();
    private MovieList movieList = new MovieList();

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

    public boolean checkoutMovie(String name) {
        for(Movie movie : movieList.getMovieList(false)){
            if(movie.getName().equals(name)){
                movie.setCheckedOut(true);
                return true;
            }
        }
        return false;
    }

    public boolean returnMovie(String name) {
        for(Movie movie : movieList.getMovieList(true)){
            if(movie.isCheckedOut() && movie.getName().equals(name)){
                movie.setCheckedOut(false);
                return true;
            }
        }
        return false;
    }
}
