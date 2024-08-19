package Assignment_5;

import java.util.Scanner;

public class FingRepeatedChar {
    public static void checker(String s) {
        for (int i = 0; i < s.length(); i++) {
            char currentC = s.charAt(i);
            boolean isRepeate = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && currentC == s.charAt(j)) {
                    isRepeate = true;
                    break;
                }
            }
            if (!isRepeate) {
                System.out.println(currentC + " is the first non-repeated character.");
                return;
            }
        }
        System.out.println("All characters are repeated");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        checker(str);
    }
}
