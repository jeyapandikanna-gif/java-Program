package com.mycompany.bankaccount;
import java.util.Scanner;

class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    // Deposit
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    // Check Balance
    public double getBalance() {
        return balance;
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double initial = sc.nextDouble();

        BankAccount account = new BankAccount(initial);

        while (true) {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    try {
                        account.deposit(dep);
                        System.out.println("Deposit successful!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 2 -> {
                    System.out.print("Enter withdraw amount: ");
                    double wit = sc.nextDouble();
                    try {
                        account.withdraw(wit);
                        System.out.println("Withdrawal successful!");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 3 -> System.out.println("Current Balance: " + account.getBalance());

                case 4 -> {
                    System.out.println("Thank you!");
                    return;
                }

                default -> System.out.println("Invalid choice!");
            }
        }
    }
}