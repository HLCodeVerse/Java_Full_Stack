package Assignment_4.OnlineBankingSystem;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountHolder account = new AccountHolder();
        Transaction t1 = new Transaction();
        int choice;

        do {
            System.out.println("1. Create Account");
            System.out.println("2. Add Money");
            System.out.println("3. Transfer Money");
            System.out.println("4. Get Statement");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    account.addAccount("1221");
                    break;
                case 2:
                    System.out.println("Enter Deposit Amount");
                    double amountForDeposit = scanner.nextDouble();
                    account.setBalance(account.getBalance ()+amountForDeposit);
                    break;
                case 3:
                    System.out.println("Enter Transferring Account Number");
                    String tAccountNumber = scanner.nextLine();
                    System.out.println("Enter amount");
                    double amount = scanner.nextDouble();
                    if (account.getBalance() >= amount) {
                        t1.transfer(tAccountNumber, amount);
                        account.setBalance(account.getBalance() - amount);
                    } else {
                        System.out.println("Balance not Sufficient for Transfer");
                    }
                    break;
                case 4:
                    account.details();
                    System.out.println("--Transaction Details--\n");
                    t1.details();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}
