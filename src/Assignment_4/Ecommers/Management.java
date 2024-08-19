package Assignment_4.Ecommers;

import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Products p1 = new Products();
        Products p2 = new Products();
        Customers c1 = new Customers();
        Order o1 = new Order();

        do {
            System.out.println("Choose an option");
            System.out.println("1. Register new Customer");
            System.out.println("2. Add Product");
            System.out.println("3. View Products & order");
            System.out.println("4. Display Orders");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            sc.nextLine ();

            switch (choice) {
                case 1:
                    c1.addCustomer();
                    break;
                case 2:
                    p1.addProduct ( );
                    p2.addProduct ( );
                    break;
                case 3:
                    p1.displayProduct ( );
                    p2.displayProduct ( );
                    System.out.println ( "Enter Selected product name for order" );
                    String oPName = sc.nextLine ( );
                    System.out.println ("Enter quantity : " );
                    int quantity = sc.nextInt ( );
                    if ( oPName.equals (  p1.getProductName ( )) ) {
                        o1.addOrder ( p1.getProductName ( ) , c1.getName ( ) , p1.getPrice ( ),quantity );
                        System.out.println ( p1.getProductName ( ) + " Oreded Succesfully "+"( "+quantity+" Quantities)");
                    } else if ( oPName.equals ( p2.getProductName ( ) )){
                        o1.addOrder ( p2.getProductName ( ) , c1.getName ( ) , p2.getPrice ( ),quantity );
                    System.out.println ( p2.getProductName ( ) + " Oreded Succesfully "+"( "+quantity+" Quantities)" );

            }  else{
                System.out.println ( "Invalid product name." );
            }
                    break;
                case 4:
                    o1.displayOrderDetails();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);
    }
}
