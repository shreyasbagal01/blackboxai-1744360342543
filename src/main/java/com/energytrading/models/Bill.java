package com.energytrading.models;

public class Bill {
    private String userId;
    private double amount;
    private String dueDate;
    private boolean isPaid;

    public Bill(String userId, double amount, String dueDate) {
        this.userId = userId;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
