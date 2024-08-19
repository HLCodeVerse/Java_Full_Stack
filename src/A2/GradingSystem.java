package A2;

import java.util.Scanner;

public class GradingSystem {
    public static void main ( String[] args ) {
        int choice = 0;
        float math = 0;
        float english = 0;
        float science = 0;
        Scanner sc = new Scanner ( System.in );
        while ( math == 0 || science == 0 || english == 0 ) {
            System.out.println ( "Add subjects" );
            System.out.println ( "1. Math" );
            System.out.println ( "2. Science" );
            System.out.println ( "3. English" );
            choice = sc.nextInt ( );

            switch ( choice ) {
                case 1:
                    System.out.println ( "Enter.." );
                    math = sc.nextFloat ( );
                    break;
                case 2:
                    System.out.println ( "Enter.." );
                    science = sc.nextFloat ( );
                    break;
                case 3:
                    System.out.println ( "Enter.." );
                    english = sc.nextFloat ( );
                    break;
            }
        }
        float totalScore = math + science + english;
        float percentage = (totalScore / 300) * 100;
        System.out.println ( "Your total score is: " + totalScore );
        System.out.println ( "Your percentage is: " + percentage );
        if ( percentage >= 90 ) {
            System.out.println ( "Grade A" );
        } else if ( percentage >= 80 && percentage < 90 ) {
            System.out.println ( "Grade B" );
        } else if ( percentage >= 70 && percentage < 80 ) {
            System.out.println ( "Grade C" );
        } else {
            System.out.println ( "Grade F" );
        }
    }
}
