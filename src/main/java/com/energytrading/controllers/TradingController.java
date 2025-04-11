package com.energytrading.controllers;

import com.energytrading.models.Transaction;
import com.energytrading.services.TradingService;

import java.util.Scanner;

public class TradingController {
    private TradingService tradingService;

    public TradingController(TradingService tradingService) {
        this.tradingService = tradingService;
    }

    public void createTransaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter transaction ID: ");
        String transactionId = scanner.nextLine();
        System.out.print("Enter buyer ID: ");
        String buyerId = scanner.nextLine();
        System.out.print("Enter seller ID: ");
        String sellerId = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter timestamp: ");
        String timestamp = scanner.nextLine();

        tradingService.createTransaction(transactionId, buyerId, sellerId, amount, timestamp);
        System.out.println("Transaction created successfully!");
    }

    public void viewAllTransactions() {
        for (Transaction transaction : tradingService.getAllTransactions()) {
            System.out.println("Transaction ID: " + transaction.getTransactionId());
            System.out.println("Buyer ID: " + transaction.getBuyerId());
            System.out.println("Seller ID: " + transaction.getSellerId());
            System.out.println("Amount: " + transaction.getAmount());
            System.out.println("Timestamp: " + transaction.getTimestamp());
            System.out.println("-----------------------------");
        }
    }
}
