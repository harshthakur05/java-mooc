package part4.exercise1;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

     public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return this.name + ": " + this.balance;
    }
}