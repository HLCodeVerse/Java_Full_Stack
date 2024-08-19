package A2;

import java.util.Scanner;

public class MenuDrivenCal {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println ( "Enter two numbers" );
        int num1 = sc.nextInt ( );
        int num2 = sc.nextInt ( );
        int choice = 0;
        do {
            System.out.println ( "Choose an option" );
            System.out.println ( "1. Addition" );
            System.out.println ( "2. Subtraction" );
            System.out.println ( "3. Multiplication" );
            System.out.println ( "4. Division" );
            System.out.println ( "5. Exit" );
            choice = sc.nextInt ( );
            switch ( choice ) {
                case 1:
                    System.out.println ( "Addition: " + (num1 + num2) );
                    break;
                case 2:
                    System.out.println ( "Subtraction: " + (num1 - num2) );
                    break;
                case 3:
                    System.out.println ( "Multiplication: " + (num1 * num2) );
                    break;
                case 4:
                    if ( num1 == 0 || num2 == 0 ) {
                        System.out.println ( "Zero not allowed" );
                        break;
                    } else {
                        System.out.println ( "Division: " + (num1 / num2) );
                    }
                    break;
                case 5:
                    System.out.println ( "Exit" );
                    break;
                default:
                    System.out.println ( "Invalid choice." );
            }
        } while ( choice != 5 );
    }
}
