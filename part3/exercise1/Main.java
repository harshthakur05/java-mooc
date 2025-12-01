package part3.exercise1;

public class Main {
    public static void main(String[] args) {

        Account myAccount = new Account("My account", 100.0);

        myAccount.deposit(20.0);

        System.out.println(myAccount.balance());
    }
}

class Account {

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
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
        }
    }

    
    public String toString() {
        return this.name + ": " + this.balance;
    }
}

