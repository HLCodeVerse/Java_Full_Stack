package Core_Java.ExceptionHandling;

import java.util.Scanner;

 class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result;

        try {
            result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catching the specific ArithmeticException for division by zero
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
