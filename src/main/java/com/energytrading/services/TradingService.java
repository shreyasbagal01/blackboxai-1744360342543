package com.energytrading.services;

import com.energytrading.models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TradingService {
    private List<Transaction> transactions = new ArrayList<>();

    public void createTransaction(String transactionId, String buyerId, String sellerId, double amount, String timestamp) {
        Transaction transaction = new Transaction(transactionId, buyerId, sellerId, amount, timestamp);
        transactions.add(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }
}
