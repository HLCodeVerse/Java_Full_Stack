package Assignment_3;

import java.util.Scanner;

class BankAccount {
    public int accountNumber;
    private String accountHolderName;
    private double balance;
    private int interestRate = 3;

    public BankAccount ( int accountNumber , String accountHolderName , double balance ) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void addAccount ( ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter Account number" );
        accountNumber = scanner.nextInt ( );
        scanner.nextLine ( );
        System.out.println ( "Enter account holder name:" );
        accountHolderName = scanner.nextLine ( );
        System.out.println ( "Enter initial balance:" );
        balance = scanner.nextDouble ( );
        System.out.println ( "Account created successfully" );
    }

    public double deposit ( double amount ) {
        balance += amount;
        return balance;
    }

    public void withdraw ( double amount ) {
        if ( balance >= amount ) {
            balance -= amount;
        } else {
            System.out.println ( "Insufficient funds" );
        }
    }

    public double addInterest ( ) {
        double interestBalance = (this.balance * this.interestRate) / 100 + this.balance;
        return interestBalance;
    }

    public void showDetail ( ) {
        System.out.println ( "Account number : " + accountNumber );
        System.out.println ( "Account Holder Name : " + accountHolderName );
        System.out.println ( "Balance : " + balance );
        System.out.println ( "Balance with interest" + addInterest ( ) );
    }
}

public class Bank {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        BankAccount account1 = new BankAccount ( 0 , "" , 0 );
        BankAccount account2 = new BankAccount ( 0 , "" , 0 );
        int accountNumber = 0;
        BankAccount Account = (accountNumber == account1.accountNumber) ? account1 : account2;
        System.out.println ( "Choose an option" );
        int choice = 0;
        while ( choice != 6 ) {
            System.out.println ( "1.Add Account" );
            System.out.println ( "2. Deposit" );
            System.out.println ( "3. Withdraw" );
            System.out.println ( "4. Check Interest" );
            System.out.println ( "5. View Account Details" );
            System.out.println ( "6. Exit" );
            choice = scanner.nextInt ( );
            switch ( choice ) {
                case 1:
                    account1.addAccount ( );
                    account2.addAccount ( );
                    break;
                case 2:
                    System.out.println ( "Enter account number:" );
                    accountNumber = scanner.nextInt ( );
                    System.out.println ( "Enter deposit amount:" );
                    double amount = scanner.nextDouble ( );
                    Account.deposit ( amount );
                    break;
                case 3:
                    System.out.println ( "Enter account number:" );
                    accountNumber = scanner.nextInt ( );

                    System.out.println ( "Enter withdraw amount:" );
                    amount = scanner.nextDouble ( );
                    Account.withdraw ( amount );
                    break;
                case 4:
                    System.out.println ( "Enter account number:" );
                    accountNumber = scanner.nextInt ( );
                    System.out.println ( "Account balance with interest : " + Account.addInterest ( ) );
                    break;
                case 5:
                    System.out.println ( "Enter account number:" );
                    accountNumber = scanner.nextInt ( );
                    ;
                    Account.showDetail ( );
                    break;
                case 6:
            }
        }

    }
}
