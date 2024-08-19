package Assignment_4.MovieTheaterBookingSystem;

import java.util.Scanner;

public class Theater {

    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        Booking b1 = new Booking ( );
        Movie m1 = new Movie ( "Bahubali" , "" , 250 );
        Movie m2 = new Movie ( "Maharaja" , "" , 240 );
        Show show = new Show ( );
        int ch;

        do {
            System.out.println ( "1. Show Movies list" );
            System.out.println ( "2. Schedule Movies" );
            System.out.println ( "3. Book Ticket" );
            System.out.println ( "4. Generate receipt" );
            ch = sc.nextInt ( );
            sc.nextLine ( );

            switch ( ch ) {
                case 1:
                    showMovies ( m1 );
                    showMovies ( m2 );
                    break;
                case 2:
                    System.out.println ( "Select Movie" );
                    System.out.println ( "1. " + m1.getmName ( ) );
                    System.out.println ( "2. " + m2.getmName ( ) );
                    int sm = sc.nextInt ( );
                    sc.nextLine ( );

                    switch ( sm ) {
                        case 1:
                            System.out.println ( "Available Shows" );
                            Show.shows ( );
                            int selectShow = sc.nextInt ( );
                            sc.nextLine ( );

                            switch ( selectShow ) {
                                case 1:
                                    m1.setShow ( show.getShow1 ( ) );
                                    break;
                                case 2:
                                    m1.setShow ( show.getShow2 ( ) );
                                    break;
                                case 3:
                                    m1.setShow ( show.getShow3 ( ) );
                                    break;
                                default:
                                    System.out.println ( "Invalid show selection" );
                            }
                            break;

                        case 2:
                            System.out.println ( "Available Shows" );
                            Show.shows ( );
                            int selectShow2 = sc.nextInt ( );
                            sc.nextLine ( );

                            switch ( selectShow2 ) {
                                case 1:
                                    m2.setShow ( show.getShow1 ( ) );
                                    break;
                                case 2:
                                    m2.setShow ( show.getShow2 ( ) );
                                    break;
                                case 3:
                                    m2.setShow ( show.getShow3 ( ) );
                                    break;
                                default:
                                    System.out.println ( "Invalid show selection" );
                            }
                            break;

                        default:
                            System.out.println ( "Invalid movie selection" );
                    }
                    break;

                case 3:
                    b1.bookNow ( );
                    System.out.println ( "Select Movie" );
                    System.out.println ( "1. " + m1.getmName ( ) );
                    System.out.println ( "2. " + m2.getmName ( ) );
                    int bookMovie = sc.nextInt ( );
                    sc.nextLine ( );
                    switch ( bookMovie ) {
                        case 1:
                            b1.settForMovie ( m1.getmName ( ) );
                            b1.setTprice ( m1.gettPrice ( ) );
                            System.out.println ( "Booking Sucessfull for" + b1.getName ( ) + " - " + m1.getmName ( ) + " - " + m2.getShow ( ) );
                            break;
                        case 2:
                            b1.settForMovie ( m2.getmName ( ) );
                            b1.setTprice ( m2.gettPrice ( ) );
                            System.out.println ( "Booking Sucessfull for" + b1.getName ( ) + " - " + m2.getmName ( ) + " - " + m2.getShow ( ) );

                        default:
                            System.out.println ( "Enjoy Your Show" );
                    }
                    break;
                case 4:
                    b1.receipt ( );
                    if ( b1.gettForMovie ( ).equals ( m1.getmName ( ) ) )
                        System.out.println ( "Your Show time : " + m1.getShow ( ) );
                    else if ( b1.gettForMovie ( ).equals ( m2.getmName ( ) ) )
                        System.out.println ( "Your Show time : " + m2.getShow ( ) );
                    break;

                default:
                    System.out.println ( "Invalid choice" );
            }
        } while ( ch != 5 );
    }

    static void showMovies ( Movie m ) {
        System.out.println ( m.getmName ( ) + " - " + m.getShow ( ) + " - " + m.gettPrice ( ) );
    }
}
