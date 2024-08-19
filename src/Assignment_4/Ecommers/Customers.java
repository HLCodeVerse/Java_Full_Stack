package Assignment_4.Ecommers;

import java.util.Scanner;

public class Customers {
    private String name;

    private Long phoneNumber;

    public String getName ( ) {
        return name;
    }

    void addCustomer ( ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter Name" );
        this.name = sc.nextLine ( );
        System.out.println ( "Enter Phone Number" );
        this.phoneNumber = sc.nextLong ( );
    }
}
