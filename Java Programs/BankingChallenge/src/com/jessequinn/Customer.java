package com.jessequinn;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double intitalAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
        this.addTransaction(intitalAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }
}
