package BankLoginSystem;

import java.util.Scanner;

public class BankUser {
    private String username;
    private String password;
    private double balance;
    Scanner scanner=new Scanner(System.in);
    public BankUser(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername ( ) {
        return username;
    }

    public String getPassword ( ) {
        return password;
    }

    public double getBalance ( ) {
        return balance;
    }

    public boolean checkPassword( String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    public void checkBalance(String username, String password){
        if(checkPassword(username, password)) {
            System.out.println("Your balance is: " + balance);
        } else {
            System.out.println("Invalid username or password.");
        }
    }
    public void deposit(String username, String password){
        if(checkPassword(username, password)) {
            System.out.println("Enter the amount to deposit:");
            double amount = scanner.nextDouble();
            balance += amount;
            System.out.println("Deposit successful. Your new balance is: " + balance);
        } else {
            System.out.println("Invalid username or password.");
        }
    }
    public void withdraw(String username, String password, double amount){
        if(checkPassword(username, password)) {
            if(balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. Your new balance is: " + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid username or password.");
        }
    }
}
