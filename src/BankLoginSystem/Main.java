package BankLoginSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankLoginSystem bankSystem= new BankLoginSystem ();
        Scanner scanner= new Scanner (System.in);
        while ( true ){
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option=scanner.nextInt ();
            switch (option) {
                case 1:
                    bankSystem.registration();
                    break;
                case 2:
                    BankUser user = bankSystem.login();
                    if (user != null) {
                        bankSystem.bankOperation (user);
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
