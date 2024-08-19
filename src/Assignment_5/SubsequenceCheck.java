package Assignment_5;

import java.util.Scanner;

public class SubsequenceCheck {
    public static void main(String[] args) {
        System.out.println("Enter strings (2) to check:");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(isSubsequence(str1, str2) ? "Yes " + str1 + " is subsequence of" + str2 : "No");
    }

    public static boolean isSubsequence(String str1, String str2) {
        int i = 0;
        for (int j = 0; j < str2.length() && i < str1.length(); j++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
            }
        }
        return i == str1.length();
    }
}
