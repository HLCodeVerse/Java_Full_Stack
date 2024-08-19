package Assignment_4.InsurancePolicyManagementSystem;

public class Policy {
    private String policyNumber;
    private double amount;
    private String issueDate;
    private String expiryDate;
    private boolean isAvailable;
    private String policyType;

    public Policy(String policyNumber, double amount, String issueDate, String expiryDate, String policyType) {
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.policyType = policyType;
        this.isAvailable = true;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void renewPolicy(String newExpiryDate) {
        this.expiryDate = newExpiryDate;
        this.isAvailable = true;
    }

    public void processClaim() {
        if (isAvailable) {
            isAvailable=false;
            System.out.println("Policy has claimed");
        } else {
            System.out.println("Policy not available");
        }
    }

    public void showPolicy() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Premium Amount: " + amount);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println ("Policy Type: "+policyType);
        System.out.println("Available : " + (isAvailable ? "Yes" : "No"));
    }
}
 class HealthPolicy extends Policy {
    public HealthPolicy(String policyNumber, double amount, String issueDate, String expiryDate,String policyType) {
        super(policyNumber, amount, issueDate, expiryDate,policyType);
    }
}
 class LifePolicy extends Policy {
    public LifePolicy(String policyNumber, double amount, String issueDate, String expiryDate, String policyType) {
        super(policyNumber, amount, issueDate, expiryDate,policyType);
    }
}
 class VehiclePolicy extends Policy {
     public VehiclePolicy ( String policyNumber , double premiumAmount , String issueDate , String expiryDate , String policyType ) {
         super ( policyNumber , premiumAmount , issueDate , expiryDate , policyType );
     }
 }
