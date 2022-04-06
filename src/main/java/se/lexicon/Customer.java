package se.lexicon;

public class Customer {
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public Customer() {
    }

    public Customer(String customerName, String emailAddress, String phoneNumber) {
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerInfo() {
        return "Customer info: Name " + customerName + ", Email: " + emailAddress + " Phone number: " + phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

