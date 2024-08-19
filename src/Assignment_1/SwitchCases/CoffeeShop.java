package Assignments;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Coffee Shop!");
        System.out.println("1. Black Coffee");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
        System.out.print("Choose a coffee type (1, 2, or 3): ");
        int choice = scanner.nextInt();

        double price;
        switch (choice) {
            case 1:
                price = 250;
                System.out.println("You chose Black Coffee. Price:  " + price);
                break;
            case 2:
                price = 125;
                System.out.println("You chose Latte. Price:  " + price);
                break;
            case 3:
                price = 430;
                System.out.println("You chose Cappuccino. Price:  " + price);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                return;
        }
    }
}
