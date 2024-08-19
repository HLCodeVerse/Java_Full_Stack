package Assignment_1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        String num =scanner.nextLine();
        if(num.charAt(0)==num.charAt(2)) { // for 3 digits
            System.out.println(num+" is a palindrome");
        } else if (num.charAt(0)==num.charAt(3) && num.charAt(1)==num.charAt(2)) { //for 4 digit numbers
            System.out.println(num+" is a palindrome");
        } else {
            System.out.println(num+" is not a palindrome");
        }
    }
}
