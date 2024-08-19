package Assignment_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println("Choose operators +, -, *, /");
        char ch=scanner.next().charAt(0);
        if(ch=='+'){
            System.out.println(num1+num2);
        }else if(ch=='-'){
            System.out.println(num1-num2);
        }else if(ch=='*'){
            System.out.println(num1*num2);
        }else if(ch=='/') {
            System.out.println(num1/num2);
        }else {
            System.out.println("Select a valid operator");
        }

    }
}
