package Assignment_4.AirlineReservationSystem;

import java.util.Scanner;

public class ARS {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner(System.in);
       Airline a=new Airline();
        System.out.println ("Add New Flights" );
       a.addFlight ();
       Passenger p1=new Passenger ("Chandan");
       int ch;
        System.out.println ("Avialable Flights" );
        System.out.print ("1. "+ a.f1.getFlightName ()+" "+a.f1.getDepartureAirport ()+" To "+a.f1.getDestination ()+"\n");
        System.out.print ("2. "+ a.f2.getFlightName ()+" "+a.f2.getDepartureAirport ()+" To "+a.f2.getDestination ()+"\n");
        System.out.println ("----- Select flights to book-----" );
        do {
            System.out.println ("3. See Flight Details" );
            ch=sc.nextInt();
            switch ( ch ) {
                case 1:
                    a.reserve ( ch );
                    break;
                case 2:
                    a.reserve ( ch );
                    break;
                case 3:
                    a.showFlightDetails ( );
                    break;
            }
        } while (ch!=4);
    }
}
