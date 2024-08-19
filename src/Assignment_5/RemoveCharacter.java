package Assignment_5;

import java.util.Scanner;

public class RemoveCharacter {
    public static void removeChar(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println("After remove " + ch + " new sentense is :" + sb);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentense:");
        String str = scanner.nextLine();
        System.out.println("Enter a character to remove");
        char ch = scanner.next().charAt(0);
        removeChar(str, ch);
    }
}
