package Assignment_1.SwitchCases;

import java.util.Scanner;

public class NumToGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade");
        int grade = scanner.nextInt();
        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
                System.out.println("Grade B");
                break;
            case 7:
                System.out.println("Grade C");
                break;
            case 6:
                System.out.println("Grade D");
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("Grade F");
                break;
        }
    }
}
