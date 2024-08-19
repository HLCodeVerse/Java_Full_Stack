package Assignment_1;

import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Color");
        String color = sc.nextLine();
        if (color.equals("red")) {
            System.out.println("Stop");
        } else if (color.equals("yellow")) {
            System.out.println("Wait");
        } else if (color.equals("green")) {
            System.out.println("Go");
        }
    }
}
