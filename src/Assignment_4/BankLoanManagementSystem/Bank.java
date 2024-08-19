package Assignment_4.BankLoanManagementSystem;

import java.util.Scanner;

public class Bank {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        Customer customer = new Customer ( );
        GoldLoan goldLoan = new GoldLoan ( );
        HomeLoan homeLoan = new HomeLoan ( );
        int ch;
        customer.addCustomer ( );
        System.out.println ( "Enter Amount" );
        double amount = sc.nextDouble ( );
        customer.setAmount ( amount );

        do {
            System.out.println ( "Choose one loan" );
            System.out.println ( "1. Gold Loan" );
            System.out.println ( "2. Home Loan" );
            System.out.println ( "3. Calculate Interest" );
            System.out.println ( "4. Loan Details" );
            System.out.println ( "5. Exit" );
            ch = sc.nextInt ( );
            switch ( ch ) {
                case 1:
                    customer.setLoanType ( goldLoan.getLoanName ( ) );
                    System.out.println ( "Gold Loan for " + customer.getCustomerName ( ) + " sanctioned.." );
                    break;
                case 2:
                    customer.setLoanType ( homeLoan.getLoanName ( ) );
                    System.out.println ( "Home Loan for " + customer.getCustomerName ( ) + " sanctioned.." );
                    break;
                case 3:
                    System.out.println ( "Enter Loan tenure in years" );
                    float t = sc.nextFloat ( );
                    customer.setTenure ( t );

                    double interestRate = 0;
                    if ( customer.getLoanType ( ).equals ( goldLoan.getLoanName ( ) ) ) {
                        interestRate = goldLoan.interest ( );
                    } else if ( customer.getLoanType ( ).equals ( homeLoan.getLoanName ( ) ) ) {
                        interestRate = homeLoan.interest ( );
                    }
                    double interest = amount * t * interestRate / 100;
                    customer.setInterest ( interest );
                    System.out.println ( "Your Interest amount is: " + interest );
                    System.out.println ( "Total Amount to be repaid : " + (amount + interest) );
                    break;
                case 4:
                    customer.loanDetails ( );
                    break;
            }
        } while ( ch != 5 );
    }
}
