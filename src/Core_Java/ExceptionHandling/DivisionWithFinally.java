package Core_Java.ExceptionHandling;

import java.util.Scanner;

public class DivisionWithFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int result = 0;

        try {
            // Attempt to divide num1 by num2
            result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the case where num2 is 0
            System.out.println("Error: " + e.getMessage());
        } finally {
            // This block will always execute, regardless of an exception occurring
            System.out.println("Operation Complete");
        }
    }
}
