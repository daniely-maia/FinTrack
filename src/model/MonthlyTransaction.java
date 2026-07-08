package FinTrack.model;

import java.time.LocalDate;

public class MonthlyTransaction extends Transaction {
    private int month;

    public MonthlyTransaction(String desc, double amount, boolean isRevenue, LocalDate date, int month) {
        super(desc, amount, isRevenue, date);
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
