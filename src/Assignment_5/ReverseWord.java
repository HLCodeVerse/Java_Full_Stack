package Assignment_5;

import java.util.Scanner;

public class ReverseWord {
    public static void wordReversed(String s) {
        String[] words = s.split(" ");

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            System.out.print(reversedWord + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentence");
        String sentence = sc.nextLine();
        wordReversed(sentence);
    }
}
