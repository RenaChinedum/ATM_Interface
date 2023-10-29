package org.rena;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " Your account balance is " + balance + ".");
        } else {
            System.out.println("Amount Must be greater than " + amount);
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Your Withdrawal of $" + amount + " was successful, Your balance is " + balance + ".");
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
        return false;
    }
}
