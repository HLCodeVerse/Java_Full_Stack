package Core_Java.Generics;

public class GenericMethod {
    public static void main ( String[] args ) {
        show( "Hello");
        show ( 123 );
    }
    public static <T> void show(T t){
        System.out.println (t );
    }
}