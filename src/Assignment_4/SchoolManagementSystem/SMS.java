package Assignment_4.SchoolManagementSystem;

import java.util.Scanner;

public class SMS {
    public static void main ( String[] args ) {
        int ch;
        Scanner sc = new Scanner ( System.in );

        School t1 = new Teacher ( );

        Teacher t2=new Teacher();
        t2.randomMethod();



        Student s1 = new Student ( );

        do {
            System.out.println ( "Choose an option:" );
            System.out.println ( "1. Add Teacher" );
            System.out.println ( "2. Display details" );
            System.out.println ( "3. Remove Teacher" );
            System.out.println ( "4. Add Student" );
            System.out.println ( "5. Display Students" );
            System.out.println ( "6. Remove Student" );
            System.out.println ( "7. Display all" );
            System.out.println ( "8. Exit" );
            ch = sc.nextInt ( );

            switch ( ch ) {
                case 1:
                    t1.add ( );
                    break;
                case 2:
                    t1.displayDetails ( );
                    break;
                case 3:
                    t1.remove ( );
                    break;
                case 4:
                    s1.add ( );
                    break;
                case 5:
                    s1.displayDetails ( );
                    break;
                case 6:
                    s1.remove ( );
                    break;
                case 7:
                    t1.displayDetails ( );
                    System.out.println ( "---------------------------------" );
                    s1.displayDetails ( );
                    break;
                case 8:
                    System.out.println ( "Exiting..." );
                    break;
                default:
                    System.out.println ( "Invalid option. Please choose again." );
            }
        } while ( ch != 8 );
    }
}