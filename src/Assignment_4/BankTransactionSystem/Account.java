package Assignment_4.BankTransactionSystem;

public class Account {
    private Long accountNumber;
    private String customerName;
    private double balance;

    public Long getAccountNumber ( ) {
        return accountNumber;
    }

    public String getCustomerName ( ) {
        return customerName;
    }

    public double getBalance ( ) {
        return balance;
    }

    public void setBalance ( double balance ) {
        this.balance = balance;
    }

    Account( Long accountNumber, String customerName, double balance){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }
}
