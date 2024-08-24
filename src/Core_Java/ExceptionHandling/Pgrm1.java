package Core_Java.ExceptionHandling;

public class Pgrm1 {
    public static void main ( String[] args ) {
        int arr[] = new int[5];
        try {
            System.out.println (arr[6] );
        }catch (ArrayIndexOutOfBoundsException e) {
            //error message
            System.out.println (e.getMessage () );
            //Customized error message
            System.out.println ("You cannot access beyond limit or length" );
        }
    }
}
