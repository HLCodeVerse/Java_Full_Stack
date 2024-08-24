package Core_Java.ExceptionHandling;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class ZeroBalanceException extends Exception {
    public ZeroBalanceException(String message) {
        super(message);
    }
}

public class BankingSystem {
    private int balance;

    public BankingSystem(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) throws NegativeAmountException, ZeroBalanceException {
        if (amount < 0) {
            throw new NegativeAmountException("Deposit amount cannot be negative.");
        } else if (amount == 0) {
            throw new ZeroBalanceException("Deposit amount cannot be 0.");
        }
        balance += amount;
        System.out.println("Successfully deposited ₹" + amount);
    }

    public void withdraw(int amount) throws InsufficientFundsException, NegativeAmountException, ZeroBalanceException {
        if (amount < 0) {
            throw new NegativeAmountException("Withdraw amount cannot be negative.");
        }
        if (balance == 0) {
            throw new ZeroBalanceException("Cannot withdraw from a zero balance account.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.println("Successfully withdrawn ₹" + amount);
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // try-with-resources to automatically close the Scanner
            BankingSystem bank = new BankingSystem(5000);

            while (true) {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        int depositAmount = sc.nextInt();
                        try {
                            bank.deposit(depositAmount);
                        } catch (NegativeAmountException | ZeroBalanceException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        int withdrawAmount = sc.nextInt();
                        try {
                            bank.withdraw(withdrawAmount);
                        } catch (NegativeAmountException | InsufficientFundsException | ZeroBalanceException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case 3:
                        bank.checkBalance();
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;  // Exits the program, no need for break here

                    default:
                        System.out.println("Invalid option! Please try again.");
                }
            }
        }
    }
}
