package Assignment_4.Ecommers;

import java.util.Scanner;

public class Products {
    private String productName;
    private double money;
    private int quantity;

    public String getProductName ( ) {
        return productName;
    }

    public double getPrice ( ) {
        return money;
    }

    public void addProduct ( ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter Product name: " );
        productName = scanner.nextLine ( );
        System.out.print ( "Enter Product price: " );
        money = scanner.nextDouble ( );
        System.out.print ( "Enter Product quantity: " );
        quantity = scanner.nextInt ( );
    }

    public void displayProduct ( ) {
        System.out.println ( "Product Name: " + productName );
        System.out.println ( "Product Price: " + money );
        if ( quantity > 0 ) {
            System.out.println ( "In Stock" );
        } else {
            System.out.println ( "Out of Stock" );
        }
    }
}
