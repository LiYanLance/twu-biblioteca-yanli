package com.twu.biblioteca;

import java.util.List;

public class View {


    public void printMenu(){
        String menu = "1. List Books \n" +
                "2. Checkout Book \n" +
                "3. Return Book\n" +
                "4. List Movies \n" +
                "5. Checkout Movie \n" +
                "6. Return Movie\n" +
                "7. Quit \n";
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

    public void showMovieList(boolean isCheckedOut) {
        StringBuilder stringBuilder = new StringBuilder();
        MovieList movieList = new MovieList();
        List<Movie> movies = isCheckedOut ? movieList.getMovieList(isCheckedOut) : movieList.getMovieList(isCheckedOut);
        stringBuilder.append("Name\t").append("Director\t").append("Year\t").append("Rating\n");
        for(Movie movie : movies){
            stringBuilder.append(movie.getName() + "\t")
                    .append(movie.getDirector() + "\t")
                    .append(movie.getYear() + "\t")
                    .append(movie.getRating() + "\t\n");
        }
        System.out.println(stringBuilder.toString());
    }
}
