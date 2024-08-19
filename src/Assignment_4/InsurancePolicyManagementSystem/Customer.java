package Assignment_4.InsurancePolicyManagementSystem;

public class Customer {
    private String cName;
    private Long mNumber;
    private String address;
    public Customer(String cName, Long mNumber, String address) {
        this.cName = cName;
        this.mNumber = mNumber;
        this.address = address;
    }
    public void showCustomer() {
        System.out.println("Customer Name: " + cName);
        System.out.println("Mobile Number: " + mNumber);
        System.out.println("Address: " + address);
    }
}
