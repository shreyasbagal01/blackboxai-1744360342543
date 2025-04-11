package com.energytrading.services;

import com.energytrading.models.User;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> users = new HashMap<>();

    public void registerUser(String id, String username, String password, String walletAddress) {
        User user = new User(id, username, password, walletAddress);
        users.put(id, user);
    }

    public User getUserById(String id) {
        return users.get(id);
    }

    public User getUserByUsername(String username) {
        return users.values().stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    public void updateUser(User user) {
        users.put(user.getId(), user);
    }
}
