package test;

import org.junit.Test;
import static org.junit.Assert.*;

import com.movie.movielistapp.User;
import com.movie.movielistapp.UserManager;

/**
 *
 * @author RAZIBUL
 */
public class UserRegistrationTest {
    
    @Test
    public void testRegisterUser() {
        UserManager userManager = new UserManager();
        String email = "test@example.com";
        
        userManager.registerUser(email);
        User user = userManager.getUserByEmail(email);
        
        assertNotNull(user);
        assertEquals(email, user.getEmail());
    }
}
