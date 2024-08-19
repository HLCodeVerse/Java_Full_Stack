package Assignment_5;

import java.util.Scanner;

public class CharacterOccurance {
    public static void main ( String[] args ) {
        Scanner sc=new Scanner(System.in);
        System.out.println ("Enter a sentence" );
        String text =sc.nextLine();
        System.out.println ("Enter finding character" );
        char character=sc.next ().charAt ( 0 );
        int count=0;
        for (int i=0;i<text.length();i++) {
            if(text.charAt ( i )==character){
                count++;
            }
        }
        System.out.println (character+" used "+count+" Times" );
    }
}
