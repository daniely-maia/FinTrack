package FinTrack.app;

import java.time.LocalDate;
import java.util.Scanner;
import FinTrack.controller.FinTracker;
import FinTrack.model.Transaction;
import FinTrack.utils.Formatter;
import FinTrack.exceptions.InvalidInputException;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    FinTracker finTracker = new FinTracker();

    int opt = 0;

    while(opt != 5) {

        try {

            System.out.println("\n======== FinTrack ========");
            System.out.println("1. Add transaction");
            System.out.println("2. List transactions");
            System.out.println("3. Show balance");
            System.out.println("4. Remove transaction");
            System.out.println("5. Exit");
    
            System.out.println("\nPick an option from above: ");
            opt = scanner.nextInt();
            scanner.nextLine();
    
            switch (opt) {
                case 1:
                    System.out.println("\nDescription: ");
                    String desc = scanner.nextLine();
    
                    System.out.println("\nAmount: ");
                    double amount = scanner.nextDouble();
                    if(amount <= 0) {
                        throw new InvalidInputException("\nAmount must be higher than 0.");
                    }
                    scanner.nextLine();
    
                    System.out.println("\nisIncome: ");
                    boolean isIncome = scanner.nextBoolean();
                    scanner.nextLine();
    
                    LocalDate date = LocalDate.now();

                    Transaction transaction = new Transaction(desc, amount, isIncome, date);

                    finTracker.addTransaction(transaction);
    
                    System.out.println("\nTransaction added successfully.");
                    break;
                case 2:
                    finTracker.listTransactions();
                    break;
                case 3:
                    System.out.println("\nTotal balance: " + Formatter.formatCurrency(finTracker.calculateTotalBalance()));
                    break;
                case 4:
                    System.out.println("\nType the index of the transaction: ");
                    int index = scanner.nextInt();
                    
                    finTracker.removeTransaction(index);
                    break;
                case 5:
                    System.out.println("\nExiting FinTrack...");
                    break;

            }

        } catch(InvalidInputException e) {

            System.out.println(e.getMessage());
            scanner.nextLine();
            
            System.out.println("\nInvalid option. Try again.");
            scanner.nextLine();

        }

    }
    
    scanner.close();

    }
}
