package com.twu.biblioteca;

public class Controller {

    private BookList bookList = new BookList();
    private MovieList movieList = new MovieList();

    public boolean checkoutBook(String title, String borrowerNumber) {
        for(Book book : bookList.getBookList(false)){
            if(book.getTitle().equals(title)){
                book.setCheckedOut(true);
                book.setBorrowerNumber(borrowerNumber);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String title) {
        for(Book book : bookList.getBookList(true)){
            if(book.isCheckedOut() && book.getTitle().equals(title)){
                book.setCheckedOut(false);
                book.setBorrowerNumber("");
                return true;
            }
        }
        return false;
    }

    public boolean checkoutMovie(String name, String borrowerNumber) {
        for(Movie movie : movieList.getMovieList(false)){
            if(movie.getName().equals(name)){
                movie.setCheckedOut(true);
                movie.setBorrowerNumber(borrowerNumber);
                return true;
            }
        }
        return false;
    }

    public boolean returnMovie(String name) {
        for(Movie movie : movieList.getMovieList(true)){
            if(movie.isCheckedOut() && movie.getName().equals(name)){
                movie.setCheckedOut(false);
                movie.setBorrowerNumber("");
                return true;
            }
        }
        return false;
    }

    public User login() {
        System.out.println("Please enter your library number:");
        String number = InputHandler.getInput();
        System.out.println("Please enter your password:");
        String password = InputHandler.getInput();
        User user = new User(number, password);
        return user;
    }
}
