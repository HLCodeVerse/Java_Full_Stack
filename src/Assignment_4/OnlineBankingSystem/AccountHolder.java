package Assignment_4.OnlineBankingSystem;

import java.util.Scanner;

public  class AccountHolder {
    Scanner sc = new Scanner(System.in);
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addAccount(String accountNumber) {
        System.out.println("Account Holder Name");
        String accountHolderName = sc.nextLine();
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        System.out.println("Account Created");
    }

    public void details() {
        System.out.println("Account holder name " + accountHolderName);
        System.out.println("Account Number " + accountNumber);
        System.out.println("Available Balance " + balance);
    }
}