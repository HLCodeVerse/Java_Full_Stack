package A2;

import java.util.Scanner;

public class Factorial {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int num=0;
        do {
            System.out.println ( "Enter a number" );
            num = sc.nextInt ( );
            int i = 1;
            int fact = 1;
            do {
                if ( num > 0 ) {
                    fact = fact * i;
                } else {
                    System.out.println ( "Enter a positive number" );
                }
                i++;
            } while ( i <= num );
            System.out.println ( fact );


        } while ( true );
    }
}
