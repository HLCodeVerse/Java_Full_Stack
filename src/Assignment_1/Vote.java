package Assignment_1;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Eligible to vote");
        } else if (age <= 18) {
            System.out.println("Note eligible to vote");
        }
    }
}
