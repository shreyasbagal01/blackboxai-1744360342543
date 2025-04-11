package com.energytrading.controllers;

import com.energytrading.models.User;
import com.energytrading.services.UserService;

import java.util.Scanner;

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void registerUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter wallet address: ");
        String walletAddress = scanner.nextLine();

        userService.registerUser(id, username, password, walletAddress);
        System.out.println("User registered successfully!");
    }

    public void loginUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = userService.getUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login successful! Welcome, " + username);
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
