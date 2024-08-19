package Assignment_3;

import java.util.Scanner;

class Items {
    String name;
    int quantity;
    int price;

    Items ( String name , int quantity , int price ) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void ShowDetails ( ) {
        System.out.println ( "Name: " + name );
        System.out.println ( "Quantity: " + quantity );
        System.out.println ( "Price: " + price );
    }
}

public class Inventory {
    Items i1, i2, i3;

    // A method to add an item.
    public String AddItems ( ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter item name: " );
        String iName = scanner.nextLine ( );
        System.out.print ( "Enter item quantity: " );
        int iQuantity = scanner.nextInt ( );
        System.out.print ( "Enter item price: " );
        int iPrice = scanner.nextInt ( );
        scanner.nextLine ( );
        i1 = new Items ( iName , iQuantity , iPrice );

        System.out.print ( "Enter item name: " );
        String i2Name = scanner.nextLine ( );
        System.out.print ( "Enter item quantity: " );
        int i2Quantity = scanner.nextInt ( );
        System.out.print ( "Enter item price: " );
        int i2Price = scanner.nextInt ( );
        scanner.nextLine ( );
        i2 = new Items ( i2Name , i2Quantity , i2Price );

        System.out.print ( "Enter item name: " );
        String i3Name = scanner.nextLine ( );
        System.out.print ( "Enter item quantity: " );
        int i3Quantity = scanner.nextInt ( );
        System.out.print ( "Enter item price: " );
        int i3Price = scanner.nextInt ( );
        scanner.nextLine ( );
        i3 = new Items ( i3Name , i3Quantity , i3Price );

        return "Items Added";
    }

    // Remove items
    public void removeItems ( ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter item name to remove: " );
        String iName = scanner.nextLine ( );

        if ( i1.name == iName ) {
            i1 = null;
            System.out.println ( "Item removed" );
        } else if ( i2.name == iName ) {
            i2 = null;
            System.out.println ( "Item removed" );
        } else if ( i3.name == iName ) {
            i3 = null;
            System.out.println ( "Item removed" );
        } else {
            System.out.println ( "Item not found" );
        }
    }

    // Display all items
    public void displayItems ( ) {
        i1.ShowDetails ( );
        i2.ShowDetails ( );
        i3.ShowDetails ( );
    }

    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int choice = 0;

        Inventory inventory = new Inventory ( );
        System.out.println ( "Choose an option..." );
        while ( choice != 4 ) {
            System.out.println ( "1. Add Items" );
            System.out.println ( "2. Remove Items" );
            System.out.println ( "3. Display Items" );
            System.out.println ( "4. Exit" );
            choice = scanner.nextInt ( );

            switch ( choice ) {
                case 1:
                    inventory.AddItems ( );
                    break;
                case 2:
                    inventory.removeItems ( );
                    break;
                case 3:
                    inventory.displayItems ( );
                    break;
                case 4:
                    System.out.println ( "Exiting..." );
                    break;
                default:
                    System.out.println ( "Invalid option!" );
            }
        }
    }
}
