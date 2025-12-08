package part4.exercise9;

public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double intialBalance ,double intialInterestRate){
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    public void printBalance(){
        System.out.println(this.balance);
    }
    public void waitOneYear(){
        this.balance = this.balance*this.interestRate;
    }

    
}
