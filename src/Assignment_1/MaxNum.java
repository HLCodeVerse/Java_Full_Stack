package Assignment_1;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("num1  is MaxNum");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("num2 is MaxNum");
        } else {
            System.out.println("num3 is MaxNum");
        }
    }
}
