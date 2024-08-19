package Assignment_5;
import java.util.Scanner;
public class CapitalizeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter a sentence:" );
        String sentence = scanner.nextLine ( );
        String words[]=sentence.split( " " );
        StringBuilder sb=new StringBuilder();
        for (String word:words) {
            sb.append ( Character.toUpperCase(word.charAt ( 0 ))).append ( word.substring ( 1 ) ).append ( " " );
        }
        System.out.println ( sb );
    }
}