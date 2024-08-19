package Assignment_5;
//Develop a Java program to count the number of words in a given string.

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String sentence = sc.nextLine();
        String words[] = sentence.split(" ");
        for (String word : words) {
            count++;
        }
        System.out.println("There are " + count + " words in above sentence");
    }
}
