package Assignment_4.MovieTheaterBookingSystem;

import java.util.Scanner;

public class Booking {
    Scanner sc = new Scanner ( System.in );
    private String name;
    private String tForMovie;
    private double tprice;

    public String getName ( ) {
        return name;
    }

    public String gettForMovie ( ) {
        return tForMovie;
    }

    public void settForMovie ( String tForMovie ) {
        this.tForMovie = tForMovie;
    }

    public double getTprice ( ) {
        return tprice;
    }

    public void setTprice ( double tprice ) {
        this.tprice = tprice;
    }

    public void bookNow ( ) {
        System.out.println ( "Enter name" );
        String name = sc.nextLine ( );
        this.name = name;
    }

    public void receipt ( ) {
        System.out.println ( "Customer name " + name );
        System.out.println ( "Selected movie " + tForMovie );
        System.out.println ( "Ticket Price " + tprice );
    }
}
