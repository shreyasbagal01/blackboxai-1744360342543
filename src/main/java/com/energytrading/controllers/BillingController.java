package com.energytrading.controllers;

import com.energytrading.models.Bill;
import com.energytrading.services.BillingService;

import java.util.Scanner;

public class BillingController {
    private BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    public void createBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter bill amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter due date: ");
        String dueDate = scanner.nextLine();

        billingService.createBill(userId, amount, dueDate);
        System.out.println("Bill created successfully!");
    }

    public void viewBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();

        Bill bill = billingService.getBillByUserId(userId);
        if (bill != null) {
            System.out.println("Bill Amount: " + bill.getAmount());
            System.out.println("Due Date: " + bill.getDueDate());
            System.out.println("Is Paid: " + bill.isPaid());
        } else {
            System.out.println("No bill found for this user.");
        }
    }

    public void payBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();

        billingService.payBill(userId);
    }
}
