package com.energytrading.services;

import com.energytrading.models.Bill;

import java.util.HashMap;
import java.util.Map;

public class BillingService {
    private Map<String, Bill> bills = new HashMap<>();

    public void createBill(String userId, double amount, String dueDate) {
        Bill bill = new Bill(userId, amount, dueDate);
        bills.put(userId, bill);
    }

    public Bill getBillByUserId(String userId) {
        return bills.get(userId);
    }

    public void payBill(String userId) {
        Bill bill = bills.get(userId);
        if (bill != null) {
            bill.setPaid(true);
            System.out.println("Bill paid successfully!");
        } else {
            System.out.println("No bill found for this user.");
        }
    }
}
