package FinTrack.model;

import java.time.LocalDate;

import FinTrack.utils.Formatter;

public class Transaction {
    private String desc;
    private double amount;
    private boolean isRevenue;
    private LocalDate date;

    public Transaction(String desc, double value, boolean isRevenue, LocalDate date) {
        this.desc = desc;
        this.amount = value;
        this.isRevenue = isRevenue;
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double value) {
        this.amount = value;
    }

    public boolean getIsRevenue() {
        return isRevenue;
    }

    public void setIsRevenue(boolean isRevenue) {
        this.isRevenue = isRevenue;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return  "isRevenue: " + isRevenue +
                "\nDescription: " + desc +
                "\nValue: " + Formatter.formatCurrency(amount) +
                "\nDate: " + date;   
    }

}
