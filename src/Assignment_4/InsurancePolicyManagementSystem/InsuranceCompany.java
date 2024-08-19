package Assignment_4.InsurancePolicyManagementSystem;

import java.util.Scanner;

public class InsuranceCompany {
    private Customer customer1;
    private Customer customer2;
    private Policy policy1;
    private Policy policy2;

    public void issuePolicy(Policy policy) {
        if (policy1 == null) {
            policy1 = policy;
        } else if (policy2 == null) {
            policy2 = policy;
        } else {
            System.out.println("Only allowed 2 policies");
        }
    }

    public void addCustomer(Customer customer) {
        if (customer1 == null) {
            customer1 = customer;
        } else if (customer2 == null) {
            customer2 = customer;
        } else {
            System.out.println("Only 2 customers allowed");
        }
    }

    public void renewPolicy(String policyNumber, String newDate) {
        if (policy1 != null && policy1.getPolicyNumber().equals(policyNumber)) {
            policy1.renewPolicy(newDate);
            System.out.println("Policy " + policyNumber + " renewed.");
        } else if (policy2 != null && policy2.getPolicyNumber().equals(policyNumber)) {
            policy2.renewPolicy(newDate);
            System.out.println("Policy " + policyNumber + " renewed.");
        } else {
            System.out.println("Policy not found");
        }
    }

    public void processClaim(String policyNumber) {
        if (policy1 != null && policy1.getPolicyNumber().equals(policyNumber) && policy1.isAvailable ()) {
            policy1.processClaim();
        } else if (policy2 != null && policy2.getPolicyNumber().equals(policyNumber) && policy2.isAvailable ()) {
            policy2.processClaim();
        } else {
            System.out.println("Policy not found.");
        }
    }

    public void displayPolicies() {
        if (policy1 != null) {
            policy1.showPolicy();
        }
        if (policy2 != null) {
            policy2.showPolicy();
        }
    }

    public void displayCustomers() {
        if (customer1 != null) {
            customer1.showCustomer();
        }
        if (customer2 != null) {
            customer2.showCustomer();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InsuranceCompany company = new InsuranceCompany();

        int choice;
        do {
            System.out.println("1. Add Customer");
            System.out.println("2. Issue Policy");
            System.out.println("3. Renew Policy");
            System.out.println("4. Process Claim");
            System.out.println("5. Display Policies");
            System.out.println("6. Display Customers");
            System.out.println("7. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Customer Name:");
                    String cName = scanner.nextLine();
                    System.out.println("Enter Mobile Number:");
                    Long mNumber = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("Enter Address:");
                    String address = scanner.nextLine();
                    Customer customer = new Customer(cName, mNumber, address);
                    company.addCustomer(customer);
                    break;

                case 2:
                    System.out.println("Enter Policy Number:");
                    String policyNumber = scanner.nextLine();
                    System.out.println("Enter Policy Type (Health/Life/Vehicle):");
                    String policyType = scanner.nextLine();
                    System.out.println("Enter Amount:");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter Issue Date:");
                    String issueDate = scanner.nextLine();
                    System.out.println("Enter Expiry Date:");
                    String expiryDate = scanner.nextLine();

                    Policy policy;
                    if (policyType.equals ("Health")) {
                        policy = new HealthPolicy(policyNumber, amount, issueDate, expiryDate,policyType);
                    } else if (policyType.equals ("Life")) {
                        policy = new LifePolicy(policyNumber, amount, issueDate, expiryDate,policyType);
                    } else {
                        policy = new VehiclePolicy(policyNumber, amount, issueDate, expiryDate,policyType);
                    }
                    company.issuePolicy(policy);
                    break;
                case 3:
                    System.out.println("Enter Policy Number to Renew :");
                    String renewPolicyNumber = scanner.nextLine();
                    System.out.println("Enter New Expiry Date:");
                    String newExpiryDate = scanner.nextLine();
                    company.renewPolicy(renewPolicyNumber, newExpiryDate);
                    break;
                case 4:
                    System.out.println("Enter Policy Number to Process Claim:");
                    String claimPolicyNumber = scanner.nextLine();
                    company.processClaim(claimPolicyNumber);
                    break;
                case 5:
                    company.displayPolicies();
                    break;
                case 6:
                    company.displayCustomers();
                    break;
                case 7:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 7);
    }
}
