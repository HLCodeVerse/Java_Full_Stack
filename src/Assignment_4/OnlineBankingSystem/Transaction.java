package Assignment_4.OnlineBankingSystem;

import java.util.Scanner;

public class Transaction {
    Scanner sc = new Scanner(System.in);
    private String tAccountNumber = "1222";
    private String acHolderName = "Raghav";
    private double amount;

    public String gettAccountNumber() {
        return tAccountNumber;
    }

    public String getAcHolderName() {
        return acHolderName;
    }

    public void setAcHolderName(String acHolderName) {
        this.acHolderName = acHolderName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void transfer(String accountNumber, double amount) {
        if (accountNumber.equals(tAccountNumber)) {
            this.amount += amount;
            System.out.println("Amount transferred successfully");
        } else {
            System.out.println("Invalid Account Number");
        }
    }

    public void details() {
        System.out.println("Account holder name " + acHolderName);
        System.out.println("Account Number " + tAccountNumber);
        System.out.println("Available Balance " + amount);
    }
}
