package FinTrack.model;

import java.time.LocalDate;

import FinTrack.utils.Formatter;

public class Transaction {
    private String desc;
    private double amount;
    private boolean isIncome;
    private LocalDate date;

    public Transaction(String desc, double value, boolean isIncome, LocalDate date) {
        this.desc = desc;
        this.amount = value;
        this.isIncome = isIncome;
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

    public boolean getIsIncome() {
        return isIncome;
    }

    public void setIsIncome(boolean isIncome) {
        this.isIncome = isIncome;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return  "isIncome: " + isIncome +
                "\nDescription: " + desc +
                "\nValue: " + Formatter.formatCurrency(amount) +
                "\nDate: " + date;   
    }

}
