package Assignment_5;

import java.util.Scanner;

public class PallindromeCheck {
    public static boolean chacker(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                System.out.println("This is a palindrome");
                return true;
            }
            left++;
            right--;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.next();
        chacker(str);
    }
}
