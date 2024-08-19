package Assignment_4.RestaurantOrderingSystem;

import java.util.Scanner;

public class MenuItem {
    Scanner sc=new Scanner(System.in);
    private String iName;
    private double iPrice;
    public String getiName ( ) {
        return iName;
    }
    public void setiName ( String iName ) {
        this.iName = iName;
    }
    public double getiPrice ( ) {
        return iPrice;
    }
    public void setiPrice ( double iPrice ) {
        this.iPrice = iPrice;
    }
    public void addItem(){
        System.out.println ("Enter Item Name" );
        String iName = sc.nextLine ();
        this.iName = iName;
        System.out.println ("Enter Item Price" );
        double iPrice = sc.nextDouble ();
        this.iPrice = iPrice;
    }

    public void displayItems ( ) {
        System.out.println ( "Item Name: " + iName + " | Item Price: " + iPrice );
    }
}
