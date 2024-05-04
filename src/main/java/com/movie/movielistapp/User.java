package com.movie.movielistapp;

import java.util.ArrayList;
import java.util.List;

/***
 * @author RAZIBUL
 */
public class User {
    private String email;
    private List<Movie> favoriteMovies;

    public User(String email) {
        this.email = email;
        this.favoriteMovies = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }
    
    public List<Movie> getFavoriteMovies() {
        return favoriteMovies;
    }

    public void addFavoriteMovie(Movie movie) {
        favoriteMovies.add(movie);
    }

    public void removeFavoriteMovie(Movie movie) {
        favoriteMovies.remove(movie);
    }
    
    public List<Movie> searchFavorites(String query) {
        List<Movie> result = new ArrayList<>();
        for (Movie movie : favoriteMovies) {
            if (movie.getTitle().toLowerCase().contains(query.toLowerCase()) ||
                movie.getCast().toLowerCase().contains(query.toLowerCase()) ||
                movie.getCategory().toLowerCase().contains(query.toLowerCase())) {
                result.add(movie);
            }
        }
        return result;
    }
}
