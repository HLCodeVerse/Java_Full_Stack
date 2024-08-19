package BankLoginSystem;

import java.util.Scanner;

public class BankLoginSystem {
    private final int limit = 10;
    private BankUser users[];
    private int limitCount;
    Scanner sc = new Scanner ( System.in );

    public BankLoginSystem ( ) {
        users = new BankUser[limit];
        limitCount = 0;
    }

    public void registration ( ) {
        if ( limit >= limitCount ) {
            System.out.println ( "Limit reached. You can't register yet..." );
        }
        System.out.print ( "Enter username: " );
        String username = sc.nextLine ( );
        System.out.print ( "Enter password: " );
        String password = sc.nextLine ( );
        users[limitCount] = new BankUser ( username , password , 0.0 );
        limitCount++;
        System.out.println ( "Registration successful." );
    }

    public BankUser login ( ) {
        System.out.print ( "Enter username: " );
        String username = sc.nextLine ( );
        System.out.print ( "Enter password: " );
        String password = sc.nextLine ( );
        for (int i = 0; i < limitCount; i++) {
            if ( users[i].checkPassword ( username , password ) ) {
                return users[i];
            }
        }
        System.out.println ( "Invalid credentials.." );
        return null;
    }

    public void bankOperation ( BankUser user ) {
        while ( true ) {
            int choice;
            System.out.println ( "Choose an option:" );
            System.out.println ( "1. Check Balance" );
            System.out.println ( "2. Withdraw Money" );
            System.out.println ( "3. Deposit Money" );
            System.out.println ( "4. Logout" );
            choice = sc.nextInt ( );

            switch ( choice ) {
                case 1:
                    user.checkBalance ( user.getUsername ( ) , user.getPassword ( ) );
                    break;
                case 2:
                    System.out.print ( "Enter withdraw amount: " );
                    double withdrawAmount = sc.nextDouble ( );
                    user.withdraw ( user.getUsername ( ) , user.getPassword ( ) , withdrawAmount );
                    break;
                case 3:
                    user.deposit ( user.getUsername ( ) , user.getPassword ( ) );
                    break;
                case 4:
                    System.out.println ( "Logout successful. Thank you!" );
                    return;
                default:
                    System.out.println ( "Choose an VALID OPTION" );
            }
        }
    }
}
