package test;

import com.movie.movielistapp.Movie;
import com.movie.movielistapp.MovieManager;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RAZIBUL
 */
public class MovieDetailsTest {
    @Test
    public void testViewMovieDetails() {
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie(new Movie("The Shawshank Redemption", "Tim Robbins, Morgan Freeman", "Drama", "1994", 25000000));
        movieManager.addMovie(new Movie("The Godfather", "Marlon Brando, Al Pacino", "Crime", "1972", 6000000));

        Movie movie = movieManager.getMovieByTitle("The Shawshank Redemption");
        assertNotNull(movie);
        assertEquals("The Shawshank Redemption", movie.getTitle());
        assertEquals("Tim Robbins, Morgan Freeman", movie.getCast());
        assertEquals("Drama", movie.getCategory());
        assertEquals("1994", movie.getReleaseDate());
        assertEquals(25000000, movie.getBudget(), 0);
    }
}
