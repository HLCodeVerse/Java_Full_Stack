package A2;

import java.util.Scanner;

public class PatternGenerator {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        char choice = ' ';
        System.out.println ( "Enter A for ascending order and D for Descending Order" );
        choice = scanner.next ( ).charAt ( 0 );
        if ( choice == 'A' ) {
            for (int i = 1; i <= 4; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print ( i );
                }
                System.out.println ( );
            }
        } else {
            for (int i = 4; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print ( i );
                }
                System.out.println ( );
            }
        }
    }
}
