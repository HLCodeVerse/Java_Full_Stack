package Assignment_1;

import java.util.Scanner;

public class LeapYearNested {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a year to check if it is a leap year:");
            int year = scanner.nextInt();

            if (year % 4 == 0){
                if(year % 100 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }

}