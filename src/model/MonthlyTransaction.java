package FinTrack.model;

import java.time.LocalDate;

public class MonthlyTransaction extends Transaction {
    private int month;

    public MonthlyTransaction(String desc, double amount, boolean isIncome, LocalDate date, int month) {
        super(desc, amount, isIncome, date);
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
