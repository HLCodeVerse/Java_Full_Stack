package Assignment_4.BankLoanManagementSystem;

import java.util.Scanner;

public class Customer {
    private Long accountNumber;
    private String customerName;
    private String LoanType;
    private double amount;
    private float tenure;
    private double interest;

    public String getCustomerName ( ) {
        return customerName;
    }

    public void setLoanType ( String loanType ) {
        LoanType = loanType;
    }

    public String getLoanType ( ) {
        return LoanType;
    }

    public void setAmount ( double amount ) {
        this.amount = amount;
    }

    public void setTenure ( float tenure ) {
        this.tenure = tenure;
    }

    public float getTenure ( ) {
        return tenure;
    }

    public void setInterest ( double interest ) {
        this.interest = interest;
    }

    public void addCustomer ( ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter Account Number" );
        Long accountNumber = sc.nextLong ( );
        sc.nextLine ( );
        this.accountNumber = accountNumber;
        System.out.println ( "Enter Customer Holder Name" );
        String achNmae = sc.nextLine ( );
        this.customerName = achNmae;
    }

    public void loanDetails ( ) {
        System.out.println ( "Customer name :" + customerName );
        System.out.println ( "Account Number : " + accountNumber );
        System.out.println ( "Loan Type :" + LoanType );
        System.out.println ( "Loan Amount : " + amount );
        System.out.println ( "Lone tenure " + tenure + " Year" );
        System.out.println ( "Interest : " + interest );
        System.out.println ( "Total Amount to be Repaid: " + (amount + interest) );
    }
}
