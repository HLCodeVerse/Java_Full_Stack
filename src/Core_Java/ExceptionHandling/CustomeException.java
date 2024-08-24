package Core_Java.ExceptionHandling;

import java.util.Scanner;

// Defining a custom exception class for insufficient balance scenarios
class InsufficientBalanceException extends Exception {
    // Constructor that accepts a message and passes it to the Exception superclass
    public InsufficientBalanceException(String message) {
        super(message);  // Pass the message to the parent Exception class
    }
}

// Defining a custom exception class for negative withdrawal amounts
// This class extends InsufficientBalanceException, indicating it is a specialized case of insufficient balance
class AmountMustBePositive extends Exception {
    // Constructor that accepts a message and passes it to the InsufficientBalanceException superclass
    public AmountMustBePositive(String message) {
        super(message);  // Pass the message to the parent InsufficientBalanceException class
    }
}

// Main class to demonstrate custom exception handling
 class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initializing balance with a default value of 500
        int balance = 500;

        // Infinite loop to repeatedly ask for withdrawal amount until a valid amount is entered
        while (true) {
            // Prompting the user to enter the withdrawal amount
            System.out.println("Enter withdraw amount: ");

            // Reading the withdrawal amount entered by the user
            int withdrawAmount = sc.nextInt();

            try {
                // Checking if the withdrawal amount is greater than the current balance
                if (withdrawAmount > balance) {
                    // Throwing a custom exception if the balance is insufficient
                    throw new InsufficientBalanceException("Insufficient Balance: Cannot withdraw " + withdrawAmount);
                }
                // Checking if the withdrawal amount is negative
                else if (withdrawAmount < 0) {
                    // Throwing a custom exception if the withdrawal amount is negative
                    throw new AmountMustBePositive("Withdraw Amount Should Be Positive");
                }
                // If the withdrawal amount is valid
                else {
                    // Subtracting the withdrawal amount from the balance
                    balance -= withdrawAmount;

                    // Displaying a success message with the remaining balance
                    System.out.println("Withdrawn Successfully, Remaining Balance: " + balance);

                    // Breaking out of the loop as the transaction was successful
                    break;
                }
            }
            // Catch block to handle both custom exceptions
            catch (InsufficientBalanceException | AmountMustBePositive e) {
                // Printing the exception message to inform the user of the issue
                System.out.println(e.getMessage());
                // The loop will continue to prompt for input until a valid amount is entered
            }
        }
    }
}
