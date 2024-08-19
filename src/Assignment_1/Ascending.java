package Assignment_1;

import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int temp;

        // First, sort num1 and num2
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // Then, sort num2 and num3
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
