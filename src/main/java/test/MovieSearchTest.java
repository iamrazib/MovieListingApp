package test;

import com.movie.movielistapp.Movie;
import com.movie.movielistapp.MovieManager;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RAZIBUL
 */
public class MovieSearchTest {
    @Test
    public void testSearchMovies() {
        MovieManager movieManager = new MovieManager();
        movieManager.addMovie(new Movie("The Shawshank Redemption", "Tim Robbins, Morgan Freeman", "Drama", "1994", 25000000));
        movieManager.addMovie(new Movie("The Godfather", "Marlon Brando, Al Pacino", "Crime", "1972", 6000000));
        movieManager.addMovie(new Movie("The Dark Knight", "Christian Bale, Heath Ledger", "Action", "2008", 185000000));

        List<Movie> result1 = movieManager.searchMovies("Shawshank");
        assertEquals(1, result1.size());
        assertEquals("The Shawshank Redemption", result1.get(0).getTitle());

        List<Movie> result2 = movieManager.searchMovies("Drama");
        assertEquals(1, result2.size());
        assertEquals("The Shawshank Redemption", result2.get(0).getTitle());
    }
}
