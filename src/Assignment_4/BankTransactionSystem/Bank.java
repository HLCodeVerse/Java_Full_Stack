package Assignment_4.BankTransactionSystem;

import java.util.Scanner;

public class Bank {
    public static void main ( String[] args ) {
        Transaction transaction=new Transaction();
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println ("1. Diposite Money" );
            System.out.println ("2. Withdraw Money" );
            System.out.println ("3. Check Balance" );
            System.out.println ("4. Generate Statement" );
            System.out.println ("4. Exit" );
            choice=sc.nextInt();
            switch ( choice){
                case 1:
                    transaction.deposit();
                    break;
                case 2:
                    transaction.withdraw();
                    break;
                case 3:
                    transaction.checkBalance ();
                    break;
                case 4:
                    transaction.statement ();
                    break;
                case 5:
                    System.out.println ("Thank you");
                    break;
                default:
                    System.out.println ("Invalid choice.");
            }

        }while ( choice!=4 );
    }
}
