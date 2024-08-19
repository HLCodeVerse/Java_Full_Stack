package Assignment_5;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a pangram:");
        String str = scanner.nextLine();

        boolean isPangram = isPangram(str);
        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (sb.indexOf(String.valueOf(c)) == -1) {
                    sb.append(c);
                }
            }
        }
        return sb.length () == 26;
    }
}
