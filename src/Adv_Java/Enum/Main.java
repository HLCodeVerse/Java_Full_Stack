package Adv_Java.Enum;

public class Main {
    public static void main ( String[] args ) {
        Color c1 = Color.Blue;
        System.out.println ( c1 );

        for (Color color : Color.values ( )) {
            System.out.println ( color );
        }
    }
}
