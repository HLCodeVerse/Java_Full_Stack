package Assignment_5;

import java.util.Scanner;

public class StringVowelReverse {
    public static void main(String[] args) {
        System.out.println("Enter your String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String reslut = vowelCheck(str);
        System.out.println("Output " + reslut);
    }

    public static String vowelCheck(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U';
    }

}
