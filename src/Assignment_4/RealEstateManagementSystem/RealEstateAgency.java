package Assignment_4.RealEstateManagementSystem;

import java.util.Scanner;

public class RealEstateAgency {
    private Property property1;
    private Property property2;
    private Client client1;
    private Client client2;


    public void addProperty(Property property) {
        if (property1 == null) {
            property1 = property;
        } else if (property2 == null) {
            property2 = property;
        } else {
            System.out.println("No more space");
        }
    }

    public void addClient(Client client) {
        if (client1 == null) {
            client1 = client;
        } else if (client2 == null) {
            client2 = client;
        } else {
            System.out.println("No more Space");
        }
    }

    public void displayProperties() {
        if (property1 != null) {
            property1.showProperty();
        }
        if (property2 != null) {
            property2.showProperty();
        }
    }

    public void displayClients() {
        if (client1 != null) {
            client1.showClient();
        }
        if (client2 != null) {
            client2.showClient();
        }
    }

    public void sellProperty(String address) {
        if (property1 != null && property1.getAddress().equals(address) && property1.isAvailable()) {
            property1.setAvailable(false);
            System.out.println("Property at " + address + " has been sold.");
        } else if (property2 != null && property2.getAddress().equals(address) && property2.isAvailable()) {
            property2.setAvailable(false);
            System.out.println("Property at " + address + " has been sold.");
        } else {
            System.out.println("Property not found");
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        RealEstateAgency rAgency = new RealEstateAgency();

        int choice;
        do {
            System.out.println("1. Add Property");
            System.out.println("2. Add Client");
            System.out.println("3. Display Properties");
            System.out.println("4. Display Clients");
            System.out.println("5. Sell Property");
            System.out.println("6. Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Property Address:");
                    String address = sc.nextLine();
                    System.out.println("Enter Property Price:");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Property Type (House/Apartment/Land):");
                    String type = sc.nextLine();
                    Property property = new Property(address, price, type);
                    rAgency.addProperty(property);
                    break;
                case 2:
                    System.out.println("Enter Client Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Client Contact:");
                    String contact = sc.nextLine();
                    Client client = new Client(name, contact);
                    rAgency.addClient(client);
                    break;

                case 3:
                    rAgency.displayProperties();
                    break;

                case 4:
                    rAgency.displayClients();
                    break;

                case 5:
                    System.out.println("Enter Property Address to Sell:");
                    String sellAddress = sc.nextLine();
                    rAgency.sellProperty(sellAddress);
                    break;
                case 6:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }
}
