package AccountNew;

import java.text.NumberFormat;
public class Account_new {
    private final double RATE = 0.035;
    private String ownerName;
    private long acctNumber;
    private double balance;

    // Constructor to initialize account details
    public Account_new(String owner, long account, double initial) {
        this.ownerName = owner;
        this.acctNumber = account;
        this.balance = initial;
    }

    // Method to deposit an amount into the account
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return this.balance;
    }

    // Method to withdraw an amount from the account
    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        return this.balance;
    }

    // Method to get the current balance of the account
    public double getBalance() {
        return this.balance;
    }

    // Method to transfer the balance to another account
    public void transferBalanceTo(Account_new otherAccount) {
        otherAccount.balance += this.balance;
        this.balance = 0;
    }

    // Overriding the toString method to provide a string representation of the account
    @Override
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return "Account_old Owner: " + this.ownerName + "\n" +
                "Account_old Number: " + this.acctNumber + "\n" +
                "Balance: " + fmt.format(balance) + "\n";
    }
}
