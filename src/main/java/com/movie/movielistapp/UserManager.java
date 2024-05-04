package com.movie.movielistapp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author RAZIBUL
 */
public class UserManager {
    private Map<String, User> users;

    public UserManager() {
        this.users = new HashMap<>();
    }

    public void registerUser(String email) {
        if (!users.containsKey(email)) {
            users.put(email, new User(email));
        }
    }

    public User getUserByEmail(String email) {
        return users.get(email);
    }
}
