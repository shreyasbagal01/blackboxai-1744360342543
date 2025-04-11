package com.energytrading.models;

public class User {
    private String id;
    private String username;
    private String password;
    private String walletAddress;

    public User(String id, String username, String password, String walletAddress) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.walletAddress = walletAddress;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }
}
