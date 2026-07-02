package se.lexicon.bank;

public abstract class Account {
    private String holder;
    private double balance;

    public Account(String holder, double balance) {
        setHolder(holder);
        setBalance(balance);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        if (holder == null || holder.isBlank()) {
            throw new IllegalArgumentException("Account holder name cannot be empty.");
        }
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit cannot be negative amount.");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdraw cannot be negative amount.");
        }
        this.balance -= amount;
    }

    public abstract void processMonth();

    public void printSummary() {
        IO.println("Holder: " + holder + " | Balance: " + balance + " kr.");
    }
}
