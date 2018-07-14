package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

    public static List<Movie> movies = new ArrayList<Movie>();

    static{
        movies.add(new Movie("Movie1", "Author1",2014, 1));
        movies.add(new Movie("Movie2", "Author2",2015, 2));
        movies.add(new Movie("Movie2", "Author2",2016, 3));
        movies.add(new Movie("Movie4", "Author4",2017, 4));
        movies.add(new Movie("Movie5", "Author5",2018, 5));
    }

    public List<Movie> getMovies(){
        return movies;
    }

    public List<Movie> getMovieList(boolean isCheckedOut) {
        List<Movie> result = new ArrayList<Movie>();
        for (Movie movie : movies) {
            if(movie.isCheckedOut() == isCheckedOut){
                result.add(movie);
            }
        }
        return result;
    }
}
