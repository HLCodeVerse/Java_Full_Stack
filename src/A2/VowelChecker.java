package A2;

import java.util.Scanner;

public class VowelChecker {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        char alpha;
        while (true) {
            System.out.println ( "Enter a Character : " );
            alpha = sc.next ( ).charAt ( 0 );
            switch ( alpha ) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    System.out.println ( "Character " + alpha + " is a vowel" );
                    break;
                default:
                    System.out.println ("Character "+alpha + " is not a vowel" );

            }
        }

    }
}
