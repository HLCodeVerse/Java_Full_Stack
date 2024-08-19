package Assignment_1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter limit");
        int limit = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " ");
        System.out.print(num2+" ");
        for(int i=2;i<limit;i++){
            int num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(num3+" ");
        }
    }
}
