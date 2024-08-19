package Assignment_4.BankTransactionSystem;

import java.util.Scanner;

public class Transaction {
    Scanner sc=new Scanner(System.in);
    Account account1=new Account ( 123L,"Chandan",0.0 );
    public void deposit(){
        System.out.println ("Enter Account Number" );
        Long accountNumber = sc.nextLong();
        if(accountNumber==account1.getAccountNumber()){
            System.out.println ("Enter Amount to Deposit" );
            double amount = sc.nextDouble();
            double balance=account1.getBalance ()+amount;
            account1.setBalance ( balance );
            System.out.println ("Amount Deposited Successfully");
        }
    }
    public void withdraw() {
        System.out.println ( "Enter Account Number" );
        Long accountNumber = sc.nextLong ( );
        if ( accountNumber == account1.getAccountNumber ( ) ) {
            System.out.println ( "Enter Amount to Withdraw" );
            double amount = sc.nextDouble ( );
            double balance=account1.getBalance ();
            if ( balance>=amount ) {
              account1.setBalance (   balance-=amount );
                System.out.println ( "Amount Withdrawn Successfully" );
                System.out.println ("Left balance : "+account1.getBalance () );
            }
            else {
                System.out.println ("Insufficient Balance.." );
            }
        }
        }
    public void checkBalance () {
        System.out.println ( "Enter Account Number" );
        Long accountNumber = sc.nextLong ( );
        if ( accountNumber == account1.getAccountNumber ( ) ) {
            System.out.println ( "Your Current Balance is: " + account1.getBalance ( ) );
        }
    }
    public void statement(){
        System.out.println ("Account Number : "+account1.getAccountNumber () );
        System.out.println ("Account Holder Name : "+account1.getCustomerName () );
        System.out.println ("Current Balance : "+account1.getBalance () );
    }
}
