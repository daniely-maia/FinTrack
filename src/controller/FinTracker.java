package FinTrack.controller;

import java.util.ArrayList;
import FinTrack.exceptions.InvalidInputException;
import FinTrack.model.Transaction;

public class FinTracker {
    
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void listTransactions() {
        int index = -1;
        for(Transaction transaction : transactions) {
            index++;
            System.out.println("\nIndex: " + index);
            System.out.println(transaction);
        }
    }
    
    public double calculateTotalBalance() {
        
        double balance = 0;
        
        for(Transaction transaction : transactions) {
            if(transaction.getIsRevenue()) {
                balance += transaction.getAmount();
            } else {
                balance -= transaction.getAmount();
            }
        }
        
        return balance;
    }

    public void removeTransaction(int index) throws InvalidInputException {
        if(index >= 0 && index < transactions.size()) {
            transactions.remove(index);
            System.out.println("\nTransaction removed successfully.");
        } else {
            throw new InvalidInputException("\nInvalid index. Try again.");
        }
    }
}
