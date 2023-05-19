/*Implement a program to simulate a simple banking system. It should include functionalities like account creation, deposit, withdrawal, balance inquiry, and transaction history.*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Transaction {
    private final Date timestamp;
    private final String type;
    private final double amount;

    public Transaction(Date timestamp, String type, double amount) {
        this.timestamp = timestamp;
        this.type = type;
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

class Account {
    private final String accountNumber;
    private double balance;
    private final List<Transaction> transactionHistory;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += amount;
        Transaction transaction = new Transaction(new Date(), "DEPOSIT", amount);
        transactionHistory.add(transaction);
        System.out.println(amount + " deposited successfully");
    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Invalid withdrawal amount");
            return;
        }
        balance -= amount;
        Transaction transaction = new Transaction(new Date(), "WITHDRAWAL", amount);
        transactionHistory.add(transaction);
        System.out.println(amount + " withdrawn successfully");
    }

    public void printTransactionHistory() {
        System.out.println("Transaction History for Account Number: " + accountNumber);
        for (Transaction transaction : transactionHistory) {
            System.out.println("Timestamp: " + transaction.getTimestamp()
                    + ", Type: " + transaction.getType()
                    + ", Amount: " + transaction.getAmount());
        }
    }
}

public class Simple_banking_system {

    private static List<Account> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("==== Banking System ====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Balance Inquiry");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    performDeposit();
                    break;
                case 3:
                    performWithdrawal();
                    break;
                case 4:
                    performBalanceInquiry();
                    break;
                case 5:
                    performTransactionHistory();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = new Account(accountNumber);
        accounts.add(account);
        System.out.println("Account created successfully with account number: " + accountNumber);
    }

    private static void performDeposit() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = getAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Account not found");
            return;
        }
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private static void performWithdrawal() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = getAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Account not found");
            return;
        }
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }

    private static void performBalanceInquiry() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = getAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Account not found");
            return;
        }
        System.out.println("Account balance: " + account.getBalance());
    }

    private static void performTransactionHistory() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        Account account = getAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Account not found");
            return;
        }
        account.printTransactionHistory();
    }

    private static Account getAccountByNumber(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
