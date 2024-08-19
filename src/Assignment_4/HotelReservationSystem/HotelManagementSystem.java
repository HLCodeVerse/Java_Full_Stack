package Assignment_4.HotelReservationSystem;

import java.util.Scanner;

public class HotelManagementSystem {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner(System.in);
        Hotel hotel=new Hotel();

        int ch;
        Guest g1=new Guest("Chandan",347734433L,2);
        System.out.println ( "All Rooms" );
        System.out.println ( hotel.room1.getRoomNumber ( ) );
        System.out.println ( hotel.room2.getRoomNumber ( ) );
        System.out.println ("Enter room number to Check aviailability" );
        int rmn= sc.nextInt ( );
        hotel.checkAvailability ( rmn );
        do {
            System.out.println ("1. Book Room" );
            System.out.println ("2. Total Price" );
            ch = sc.nextInt ( );
            Room rm;
            switch ( ch ){
                case 1:
                    hotel.reserve (rmn );
                    break;
                case 2:
                    HotelManagementSystem h=new HotelManagementSystem();
                    System.out.println ( "Your total price in INR : "+hotel.totalPrice ());
                    break;
            }
        }while ( ch !=5 );
    }
}
