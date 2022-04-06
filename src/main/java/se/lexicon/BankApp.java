package se.lexicon;

public class BankApp {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Erik Svensson", "er@dd.se", "1234566");
        AccountInfo account1 = new AccountInfo(cust1);
        System.out.println("Account number is: " + account1.getAccountNumber());
        System.out.println("Account balance is: " + account1.getAccountBalance());
        account1.deposit(500);
        System.out.println("Now account balance is: " + account1.getAccountBalance());
        account1.withdraw(250);
        System.out.println("Now account balance is: " + account1.getAccountBalance());
        System.out.println(account1.getCustomer().getCustomerInfo());
    }
}
