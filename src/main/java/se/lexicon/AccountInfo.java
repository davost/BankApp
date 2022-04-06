package se.lexicon;

public class AccountInfo {
    private int accountNumber;
    private double accountBalance;
    private Customer customer;

    private static int sequencer = 0;

    public AccountInfo(Customer customer) {
        this.accountNumber = ++sequencer;
        this.customer = customer;
        this.accountBalance = getAccountBalance();
    }

    public void deposit(double amount){
        if (amount < 0) {
            throw new IllegalArgumentException("Negative amount!");
        }
        accountBalance = accountBalance + amount;

    }

    public double withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Negative amount");
        }
        if (amount > accountBalance) {
            throw new IllegalArgumentException("Amount is greater than balance");
        }
        accountBalance = accountBalance - amount;
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    //public void setAccountBalance(double accountBalance) {
    //    this.accountBalance = accountBalance;
    //}

    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}


