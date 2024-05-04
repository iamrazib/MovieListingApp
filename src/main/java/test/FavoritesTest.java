package test;

import com.movie.movielistapp.Movie;
import com.movie.movielistapp.MovieManager;
import com.movie.movielistapp.User;
import static org.junit.Assert.*;
import org.junit.Test;

/***
 * @author RAZIBUL
 */
public class FavoritesTest {
   @Test
    public void testAddToFavorites() {
        User user = new User("test@example.com");
        MovieManager movieManager = new MovieManager();
        Movie movie = new Movie("The Shawshank Redemption", "Tim Robbins, Morgan Freeman", "Drama", "1994", 25000000);
        movieManager.addMovie(movie);

        user.addFavoriteMovie(movie);
        assertTrue(user.getFavoriteMovies().contains(movie));

        user.removeFavoriteMovie(movie);
        assertFalse(user.getFavoriteMovies().contains(movie));
    } 
    
    @Test
    public void testSearchFavorites() {
        User user = new User("test@example.com");
        MovieManager movieManager = new MovieManager();
        Movie movie1 = new Movie("The Shawshank Redemption", "Tim Robbins, Morgan Freeman", "Drama", "1994", 25000000);
        Movie movie2 = new Movie("The Godfather", "Marlon Brando, Al Pacino", "Crime", "1972", 6000000);
        movieManager.addMovie(movie1);
        movieManager.addMovie(movie2);

        user.addFavoriteMovie(movie1);
        user.addFavoriteMovie(movie2);

        assertEquals(1, user.searchFavorites("Shawshank").size());
        assertEquals(1, user.searchFavorites("Godfather").size());
        assertEquals(2, user.searchFavorites("Crime").size());
    }
}
