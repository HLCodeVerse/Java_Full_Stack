package Assignment_5;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter 2 strings to check anagrams" );
        String s1 = sc.nextLine ();
        String s2 = sc.nextLine ();
        if (s1.length() == s2.length()) {
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println(s1 + " and " + s2 + " are anagrams.");
            } else {
                System.out.println(s1 + " and " + s2 + " are not anagrams.");
            }
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}
