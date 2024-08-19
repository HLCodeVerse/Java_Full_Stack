package Assignment_4.BankLoanManagementSystem;

public class Loan {
    private double interest;

    public double interest ( ) {
        return interest;
    }
}

class GoldLoan extends Loan {
    private String loanName = "Gold Loan";
    private double interest;

    public String getLoanName ( ) {
        return loanName;
    }

    @Override
    public double interest ( ) {
        return interest = 10;
    }
}

class HomeLoan extends Loan {
    private String loanName = "Home Loan";
    private double interest;

    public String getLoanName ( ) {
        return loanName;
    }

    @Override
    public double interest ( ) {
        return interest = 7;
    }
}
