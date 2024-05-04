package test;

import com.movie.movielistapp.Movie;
import com.movie.movielistapp.MovieManager;
import com.movie.movielistapp.User;
import com.movie.movielistapp.UserManager;
import org.junit.Test;
import static org.junit.Assert.*;

/***
 * @author RAZIBUL
 */
public class UserDetailsTest {
    @Test
    public void testViewUserDetails() {
        UserManager userManager = new UserManager();
        String email = "test@example.com";
        userManager.registerUser(email);
        User user = userManager.getUserByEmail(email);
        
        assertNotNull(user);
        assertEquals(email, user.getEmail());
    }

    @Test
    public void testViewFavorites() {
        UserManager userManager = new UserManager();
        String email = "test@example.com";
        userManager.registerUser(email);
        User user = userManager.getUserByEmail(email);
        
        MovieManager movieManager = new MovieManager();
        Movie movie = new Movie("The Shawshank Redemption", "Tim Robbins, Morgan Freeman", "Drama", "1994", 25000000);
        movieManager.addMovie(movie);
        user.addFavoriteMovie(movie);
        
        assertEquals(1, user.getFavoriteMovies().size());
        assertTrue(user.getFavoriteMovies().contains(movie));
    }
}
