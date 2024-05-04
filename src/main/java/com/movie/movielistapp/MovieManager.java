package com.movie.movielistapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RAZIBUL
 */
public class MovieManager {
    private List<Movie> movies;

    public MovieManager() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> searchMovies(String query) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                movie.getCast().toLowerCase().contains(query.toLowerCase()) ||
                movie.getCategory().toLowerCase().contains(query.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }
}
