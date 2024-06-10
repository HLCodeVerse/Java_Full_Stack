package Core_Java.Basics;

import java.util.Scanner;

// Conditional Statement Demo AI Voting System
public class CS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
            int eligibleAge=18-age;
            System.out.println("You are eligible to vote after "+eligibleAge+" years");
        }

    }
}
