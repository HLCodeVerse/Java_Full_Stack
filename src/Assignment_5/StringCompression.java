package Assignment_5;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word for compress");
        String word = sc.next();
        String compressedWord = compressString(word);
        System.out.println("Compressed string: " + compressedWord);
    }

    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        String compressed = sb.toString();
        return compressed;
    }
}